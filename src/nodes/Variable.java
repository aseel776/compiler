package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTableInstance;

public class Variable extends Expression{

    public String id;

    public Variable(String id){
        this.id = id;

    }
    public void check(int line){
        int parentHash = SymbolTableTraveller.currentNode.objectHash;
        Type type = TypeIdentifier.getVarType(this, parentHash);
        if(type == Type.undefined && SymbolTableTraveller.parentNode != null){
            parentHash = SymbolTableTraveller.parentNode.objectHash;
            type = TypeIdentifier.getVarType(this, parentHash);
        }
        //checking if the variable is defined
        SymbolTableInstance symbolTableInstance = new SymbolTableInstance(id, parentHash, "", line, type);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(symbolTableInstance);
        if (!errorCheck.a) {
            AntlrToNode.semanticErrors.add("Error: variable " + id + " at line " + line + " is not defined");
        }
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("variable").append("\n\t\t").append(id);
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "$" + id ;
        return str;
    }
}
