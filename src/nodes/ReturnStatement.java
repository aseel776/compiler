package nodes;

import flutter.Component;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;

public class    ReturnStatement extends Node{
    public Node returnValue;

    public ReturnStatement(Node returnValue){
        if(returnValue != null){
            this.returnValue = returnValue;
        }

    }

    @Override
    public String toString() {
        if(returnValue != null) {
            return "return" + " " + returnValue.toString() + ";";
        }else {
            return "return;" ;
        }
    }

    public void check(int line, int parentHash){
        Type functionReturnType = Type.undefined;
        for (SymbolTableInstance s : SymbolTable.table){
            if(s.objectHash == parentHash){
                functionReturnType = s.type;
                break;
            }
        }
        if(functionReturnType != Type.dynamic){
            Type returnType = Type.Void;
            if(returnValue != null){
                returnType = TypeIdentifier.getNodeType(returnValue);
            }
            if(returnType != Type.undefined){
                if(returnType != functionReturnType){
                    if(functionReturnType != Type.Void){
                        AntlrToNode.semanticErrors.add("Error: types mismatch at line " + line + ", required type is " + functionReturnType + " but provided is " + returnType);
                    }else{
                        AntlrToNode.semanticErrors.add("Error: types mismatch at line " + line + ", cannot return a value from a method with void result type");
                    }
                }
            }
        }
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("return").append("\n\t\t").append(returnValue.astImp());
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        if(returnValue != null && returnValue instanceof Component) {
            return returnValue.codeGenerationImp();
        } else if(returnValue != null) {
            str = "return" + " " + returnValue.codeGenerationImp() + ";";
            return str;
        } else{
            str =  "return;" ;
            return str;
        }
    }
}
