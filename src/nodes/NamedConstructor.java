package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import visitors.AntlrToNode;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;

public class NamedConstructor extends ClassMethod{

    public String classId;
    public String id;
    public ConsArgs args;
    public FunctionBody consBody;

    public NamedConstructor(String classId, String id, ConsArgs args, FunctionBody consBody){
        super(new Signature("void", classId+'.'+id, new ZeroArguments()));
        this.classId = classId;
        this.id = id;
        this.args = args;
        if(consBody != null) {
            this.consBody = consBody;
        }

    }
    public void check(int line){
        Type type = Type.constructor;
        int parentHash = SymbolTableTraveller.parentNode.objectHash;
        SymbolTableInstance currentElement = new SymbolTableInstance(classId + '.' + id, parentHash, "Named Constructor", line, type);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(currentElement);

        if (errorCheck.a) {
            AntlrToNode.semanticErrors.add("Error: named constructor " + classId + "." + id + " at line " + line + " is already defined at line " + errorCheck.b);
        } else {
            SymbolTable.addNode(currentElement);
        }
    }


    @Override
    public String toString() {
        String cons = classId + '.' + id + args.toString();
        if(consBody != null){
            cons = cons.concat(consBody.toString());
        }else {
            cons = cons.concat(";");
        }
        return cons;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("class method");
        str.append("\n\t\tnamed constructor");
        str.append("\n\t\t").append(classId);
        str.append("\n\t\t").append(id);
        str.append("\n\t\t").append(args.astImp());
        if(consBody != null){
            str.append("\n\t\t").append(consBody.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "function" + " " + "__construct" + "(" + args.codeGenerationImp() + ")";
        if(consBody != null){
            str = str.concat(consBody.codeGenerationImp());
        }else {
            str = str.concat(";");
        }
        return str;
    }
}
