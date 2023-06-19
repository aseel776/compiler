package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;

public class AbstractClassMethod extends ClassMethod{

    public AbstractClassMethod(Signature signature){
        super(signature);

    }
    public void check(int line){
        Type returnType = signature.returnType != null ? TypeIdentifier.getType(signature.returnType) : Type.dynamic;
        int parentHash = SymbolTableTraveller.parentNode.objectHash;
        SymbolTableInstance currentElement = new SymbolTableInstance(signature.id, parentHash, "Abstract Function", line, returnType);
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
        return "abstract" + " " + signature.toString() + ';' ;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("abstract class method");
        str.append("\n\t\t").append("abstract");
        str.append("\n\t\t").append(signature.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "abstract" + " " + "function" + " " + signature.codeGenerationImp();
        return str;
    }
}
