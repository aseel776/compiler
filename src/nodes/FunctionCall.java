package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import utils.TypeIdentifier;
import visitors.AntlrToNode;
import symbolTable.SymbolTableInstance;

public class FunctionCall extends Statement{

    public Boolean await;
    public String id;
    public Parameters parameters;

    public FunctionCall(Boolean await, String id, Parameters parameters){
        this.await = await;
        this.id = id;
        this.parameters = parameters;

    }
    public void check(int line){
        Type returnType = TypeIdentifier.getReturnType(this);
        //checking if the function is defined
        SymbolTableInstance currentElement = new SymbolTableInstance(id, 0, "", line, returnType);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(currentElement);
        if(!errorCheck.a){
            currentElement = new SymbolTableInstance(id, SymbolTableTraveller.parentNode.objectHash, "", line, returnType);
            Pair<Boolean, Integer> errorCheck2 = SymbolTableTraveller.checkIfDefined(currentElement);
            if(!errorCheck2.a){
                AntlrToNode.semanticErrors.add("Error: function " + id + " at line " + line + " is not defined");
            }
        }
    }


    @Override
    public String toString() {
        if(await){
            return "await" + " " + id + parameters.toString() + ";" ;
        }else {
            return id + parameters.toString() + ";" ;
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("function call");
        if(await){
            str.append("\n\t\tawait");
        }
        str.append("\n\t\t").append(id);
        str.append("\n\t\t").append(parameters.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = id + parameters.codeGenerationImp() + ";" ;
        return str;
    }
}
