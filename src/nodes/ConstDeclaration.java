package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;

public class ConstDeclaration extends Declaration{

    public String type;
    public Initialization init;

    public ConstDeclaration(String type, String id, Initialization init){
        super(id);
        if(type != null){
            this.type = type;
        }
        this.init = init;
    }
    public void check(int line){
        Type leftType = type != null ? TypeIdentifier.getType(type) : Type.dynamic;
        int parentHash = SymbolTableTraveller.currentNode.objectHash;
        SymbolTableInstance currentElement = new SymbolTableInstance(id, parentHash, "Const Variable", line, leftType);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(currentElement);
        if (errorCheck.a) {
            AntlrToNode.semanticErrors.add("Error: const variable " + id + " at line " + line + " is already defined at line " + errorCheck.b);
        } else {
            if (leftType != Type.dynamic){
                boolean typeMatch = TypeIdentifier.typeMatch(currentElement, init.value);
                if (!typeMatch) {
                    Type rightType = TypeIdentifier.getNodeType(init.value);
                    AntlrToNode.semanticErrors.add("Error: types mismatch at line " + line + ", required type is " + leftType + " but provided is " + rightType);
                } else {
                    SymbolTable.addNode(currentElement);
                }
            } else{
                SymbolTable.addNode(currentElement);
            }
        }
    }

    @Override
    public String toString() {
        if(type != null){
            return "const " + type + " " + id + " " + init.toString();
        }else {
            return "const " + id + " " + init.toString();
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("declaration");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "public $" + id;
        str = str.concat(' ' + init.codeGenerationImp());
        str = str.concat(";");
        return str;
    }
}
