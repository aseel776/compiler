package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;

public class InitialConditionDeclaration extends InitialCondition{

    public String type;
    public String id;
    public Expression value;

    public InitialConditionDeclaration(String type, String id, Expression value){
        this.type = type;
        this.id = id;
        this.value = value;

    }

    public void check(int line){
        Type type_ = TypeIdentifier.getType(type);
        SymbolTableInstance currentElement = new SymbolTableInstance(id, SymbolTableTraveller.currentNode.objectHash, "Local Variable", line, type_);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(currentElement);
        if (errorCheck.a) {
            AntlrToNode.semanticErrors.add("Error: variable " + id + " at line " + line + " is already defined at line " + errorCheck.b);
        } else {
            SymbolTable.addNode(currentElement);
        }
    }

    @Override
    public String toString() {
        return type + " " + id + '=' + value.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("initial condition");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "$" + id + '=' +value.codeGenerationImp();
        return str;
    }
}
