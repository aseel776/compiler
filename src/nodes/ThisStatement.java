package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTableInstance;

public class    ThisStatement extends Assignment{

    public ThisStatement(String id, Node value){
        super(id, value);
    }

    public void check(int line){
        int parentHash = SymbolTableTraveller.parentNode.objectHash;
        Type leftType = TypeIdentifier.getVarType(new Variable(id), parentHash);
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
        return "this." + id + " = " + value.toString() + ";";
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "$" + "this" + "->" + id + "=" + value.codeGenerationImp() + ";";
        return str;
    }
}
