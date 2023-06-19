package nodes;

public class UnnamedFunction extends Node{

    public Arguments arguments;
    public Boolean isAsync;
    public FunctionBody functionBody;

    public UnnamedFunction(Arguments arguments, Boolean isAsync, FunctionBody functionBody){
        this.arguments = arguments;
        this.isAsync = isAsync;
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        if(isAsync){
            return arguments.toString() + " " + "async" + functionBody.toString();
        }else {
            return arguments.toString() + " " + functionBody.toString();
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("unnamed function");
        str.append("\n\t\t").append(arguments.astImp());
        if(isAsync){
            str.append("\n\t\tasync");
        }
        str.append("\n\t\t").append(functionBody.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = str.concat("function");
        str = str.concat(arguments.codeGenerationImp());
        str = str.concat(functionBody.codeGenerationImp());
        return str;
    }
}
