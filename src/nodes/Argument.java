package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;

public class Argument extends Node{

    public String type;
    public String id;

    public Argument(String type, String id){
        if(type != null){
            this.type =type;
        }
        this.id = id;
    }

    void check(int line){
        Type type_ = type != null ? TypeIdentifier.getType(type) : Type.dynamic;
        int parentHash = SymbolTableTraveller.currentNode.objectHash;
        SymbolTableInstance currentElement = new SymbolTableInstance(id, parentHash, "Parameter", line, type_);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(currentElement);
        if(errorCheck.a){
            AntlrToNode.semanticErrors.add("Error: parameter " + id + " at line " + line + " is already defined at line " + errorCheck.b);
        }else{
            SymbolTable.addNode(currentElement);
        }
    }

    @Override
    public String toString() {
        if(type != null){
            return type + " " + id;
        }else{
            return id;
        }
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("arg ").append(this);
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        if(type != null){
            str = str.concat(type + " ");
        }
        str = str.concat("$" + id);
        return str;
    }
}
