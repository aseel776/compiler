package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import visitors.AntlrToNode;
import symbolTable.SymbolTableInstance;

public class ObjectAssignment extends Assignment {
    public String objectId;

    public ObjectAssignment(String objectId, String id, Node value ){
        super(id, value);
        this.objectId = objectId;

    }
    public void check(int line){
        Type type = Type.object;
        int parentHash = SymbolTableTraveller.currentNode.objectHash;
        //checking if the object is defined
        SymbolTableInstance symbolTableInstance = new SymbolTableInstance(objectId, parentHash, "", line, type);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(symbolTableInstance);
        if (!errorCheck.a) {
           AntlrToNode.semanticErrors.add("Error: variable " + objectId + " at line " + line + " is not defined");
        }
    }

    @Override
    public String toString() {
        return objectId + "." + id + " = " + value.toString() + ";";
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "$" + objectId + "->" + id + "=" + value.codeGenerationImp() + ";";
        return str;
    }
}
