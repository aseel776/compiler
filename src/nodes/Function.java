package nodes;

import flutter.Component;
import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;

public class Function extends Statement{
    public Signature signature;
    public Boolean isAsync;
    public FunctionBody functionBody;

    public Function(Signature signature, Boolean isAsync, FunctionBody functionBody){
        this.signature = signature;
        this.isAsync = isAsync;
        this.functionBody = functionBody;

    }
    public void check(int line){
        Type returnType = signature.returnType != null ? TypeIdentifier.getType(signature.returnType) : Type.dynamic;
        SymbolTableInstance currentElement = new SymbolTableInstance(signature.id, 0, "Function", line, returnType);
        currentElement.objectHash = this.hashCode();
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(currentElement);
        if (errorCheck.a) {
            AntlrToNode.semanticErrors.add("Error: function " + signature.id + " at line " + line + " is already defined at line " + errorCheck.b);
        } else {
            SymbolTable.addNode(currentElement);
        }
    }

    @Override
    public String toString() {
        if(isAsync){
            return signature.toString() + " " + "async" + functionBody.toString();
        }else {
            return signature.toString() + " " + functionBody.toString();
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("function");
        str.append("\n\t\t").append(signature.astImp());
        if (isAsync) {
            str.append("\n\t\tasync");
        }
        str.append("\n\t\t").append(functionBody.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        if(!(functionBody.returnStatement.returnValue instanceof Component)){
            String str = "<?php\n";
            str = str.concat("function ");
            str = str.concat(signature.codeGenerationImp());
            str = str.concat(functionBody.codeGenerationImp());
            str = str.concat("\n?>");
            return str;
        } else{
            return functionBody.returnStatement.codeGenerationImp();
        }

    }
}
