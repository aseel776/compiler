package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import visitors.AntlrToNode;
import symbolTable.SymbolTableInstance;

public class DartObject extends Node {

    public String id;
    public Parameters parameters;

    public DartObject(String id, Parameters parameters) {
        this.id = id;
        this.parameters = parameters;

    }

    public void check(int line) {
        // checking if the class is defined
        SymbolTableInstance symbolTableInstance = new SymbolTableInstance(id, 0, "", line, Type.Class);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(symbolTableInstance);
        if (!errorCheck.a) {
            AntlrToNode.semanticErrors.add("Error: class " + id + " at line " + line + " is not defined");
        }
    }

    @Override
    public String toString() {
        return "new" + " " + id + parameters.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("object");
        str.append("\n\t\t").append(id);
        str.append("\n\t\t").append(parameters.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "new" + " " + id + parameters.codeGenerationImp();
        return str;
    }
}