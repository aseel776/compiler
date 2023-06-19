package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTableInstance;

public class Assignment extends Statement{
    public String id;
    public Node value;

    public Assignment(String id, Node value){
        this.id = id;
        this.value = value;

    }

    public void check(int line){
        int parentHash = SymbolTableTraveller.currentNode.objectHash;
        Type leftType = TypeIdentifier.getVarType(new Variable(id), parentHash);
        //if it's undefined, it might be a class member being accessed through a method
        if(leftType == Type.undefined && SymbolTableTraveller.parentNode != null){
            parentHash = SymbolTableTraveller.parentNode.objectHash;
            leftType = TypeIdentifier.getVarType(new Variable(id), parentHash);
        }
        //checking if the variable is defined
        SymbolTableInstance symbolTableInstance = new SymbolTableInstance(id, parentHash, "", line, leftType);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(symbolTableInstance);
        if (!errorCheck.a) {
            AntlrToNode.semanticErrors.add("Error: variable " + id + " at line " + line + " is not defined");
        }else{
            if(leftType != Type.dynamic){
                boolean typeMatch = TypeIdentifier.typeMatch(symbolTableInstance, value);
                if(!typeMatch){
                    Type rightType = TypeIdentifier.getNodeType(value);
                    AntlrToNode.semanticErrors.add("Error: types mismatch at line " + line + ", required type is " + leftType + " but provided is " + rightType);
                }
            }
        }
    }

    @Override
    public String toString() {
        return id + " = " + value.toString() + ";";
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("assignment");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str;
        str = "$" + id + "=" + value.codeGenerationImp();
        return str;
    }
}
