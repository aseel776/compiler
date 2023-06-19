package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;

public class NormalDeclaration extends Declaration{

    public Boolean isLate;
    public String type;
    public Initialization init;

    public NormalDeclaration(Boolean isLate, String type, String id, Initialization init){
        super(id);
        this.isLate = isLate;
        if(type != null){
            this.type = type;
        }
        if(init != null){
            this.init = init;
        }

    }
    public void check(int line){
        Type leftType = type != null ? TypeIdentifier.getType(type) : Type.dynamic;
        int parentHash = SymbolTableTraveller.currentNode.objectHash;
        SymbolTableInstance currentElement = new SymbolTableInstance(id, parentHash, "Variable", line, leftType);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(currentElement);
        if (errorCheck.a) {
            AntlrToNode.semanticErrors.add("Error: variable " + id + " at line " + line + " is already defined at line " + errorCheck.b);
        } else {
            if(init != null && leftType != Type.dynamic){
                boolean typeMatch = TypeIdentifier.typeMatch(currentElement, init.value);
                if(!typeMatch){
                    Type rightType = TypeIdentifier.getNodeType(init.value);
                    AntlrToNode.semanticErrors.add("Error: types mismatch at line " + line + ", required type is " + leftType + " but provided is " + rightType);
                }else {
                    SymbolTable.addNode(currentElement);
                }
            }else {
                SymbolTable.addNode(currentElement);
            }
        }
    }


    @Override
    public String toString() {
        String normalDec = isLate? "late " : "";
        if(type != null){
            normalDec = normalDec.concat(type + " ");
        }
        normalDec = normalDec.concat(id + " ");
        if(init != null){
            normalDec = normalDec.concat(init.toString());
        }
        return normalDec;
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
        if (init != null) {
            str = str.concat(' ' + init.codeGenerationImp());
        }
        return str;
    }

}