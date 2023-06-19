package nodes;

public class Signature extends Node{

    public String returnType;
    public String id;
    public Arguments arguments;

    public Signature(String returnType, String id, Arguments arguments){
        if(returnType != null){
            this.returnType = returnType;
        }
        this.id = id;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        if(returnType != null){
            return returnType + " " + id + " " + arguments.toString();
        }else {
            return id + " " + arguments.toString();
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("signature");
        if(returnType != null){
            str.append("\n\t\t").append(returnType);
        }
        str.append("\n\t\t").append(id);
        str.append("\n\t\t").append(arguments.astImp());
        return  str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = id + arguments.codeGenerationImp();
        return str ;
    }
}
