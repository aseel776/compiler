package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;

public class StaticClassMethod extends ClassMethod{
    public Boolean isAsync;
    public FunctionBody methodBody;

    public StaticClassMethod(Signature signature, Boolean isAsync, FunctionBody methodBody){
        super(signature);
        this.isAsync = isAsync;
        this.methodBody = methodBody;

    }
    public void check(int line){
        Type returnType = signature.returnType != null ? TypeIdentifier.getType(signature.returnType) : Type.dynamic;
        int parentHash = SymbolTableTraveller.parentNode.objectHash;
        SymbolTableInstance currentElement = new SymbolTableInstance(signature.id, parentHash, "Static Class Method", line, returnType);
        currentElement.objectHash = this.hashCode();
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(currentElement);
        if (errorCheck.a) {
            AntlrToNode.semanticErrors.add("Error: class method " + signature.id + " at line " + line + " is already defined at line " + errorCheck.b);
        } else {
            SymbolTable.addNode(currentElement);
        }
    }

    @Override
    public String toString() {
        String method = "static" + " " + signature.toString() + " ";
        if(isAsync){
            method = method.concat("async");
        }
        method = method.concat(methodBody.toString());
        return method;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("static class method");
        str.append("\n\t\t").append(signature.astImp());
        if(isAsync){
            str.append("\n\t\tasync");
        }
        str.append("\n\t\t").append(methodBody.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "static"+ " " +"function"+ " " + signature.codeGenerationImp() + " ";
        str = str.concat(methodBody.codeGenerationImp());
        return str;
    }
}
