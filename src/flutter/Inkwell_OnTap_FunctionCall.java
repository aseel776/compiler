package flutter;

import nodes.FunctionCall;

public class Inkwell_OnTap_FunctionCall extends Inkwell_OnTap{

    public FunctionCall functionCall;
    public Inkwell_OnTap_FunctionCall(FunctionCall functionCall){
        this.functionCall=functionCall;
    }

    @Override
    public String toString() {
        return "inkWellOnTap:" + functionCall.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("inkwell on tap");
        str.append("\n\t\t").append(functionCall.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        // TODO Auto-generated method stub
        return null;
    }
}
