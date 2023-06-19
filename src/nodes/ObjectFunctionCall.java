package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import visitors.AntlrToNode;
import symbolTable.SymbolTableInstance;

public class ObjectFunctionCall extends FunctionCall {

    public String objectId;

    public ObjectFunctionCall(String objectId, Boolean await, String id, Parameters parameters) {
        super(await, id, parameters);
        this.objectId = objectId;
    }

    public void check(int line) {
        Type type = Type.object;
        int parentHash = SymbolTableTraveller.currentNode.objectHash;
        //check if the object is defined
        SymbolTableInstance currentElement = new SymbolTableInstance(objectId, parentHash, "", line, type);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(currentElement);
        if (!errorCheck.a) {
            AntlrToNode.semanticErrors.add("Error: variable " + objectId + " at line " + line + "is not defined");
        }
    }


    @Override
    public String toString() {
        if (await) {
            return "await" + " " + objectId + "." + id + parameters.toString() + ";";
        } else {
            return objectId + "." + id + parameters.toString() + ";";
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("object function call");
        str.append("\n\t\t").append(objectId);
        str.append("\n\t\t").append(id);
        str.append("\n\t\t").append(parameters.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str;
        str = "$" + objectId + "->" + id + parameters.codeGenerationImp() + ";";
        return str;
    }
}
