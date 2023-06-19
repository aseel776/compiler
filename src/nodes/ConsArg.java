package nodes;

public class ConsArg extends Node {

    public String type;
    public String id;

    public ConsArg(String type, String id){
        if(type != null) {
            this.type = type;
        }
        this.id = id;
    }

    @Override
    public String toString() {
        if(type != null){
            if(type.compareTo("this") == 0){
                return "this." + id;
            }else{
                return type.toString() + " " + id;
            }
        }else{
            return id;
        }
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("constructor arg").append("\n\t\t").append(this);
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        if(type != null){
            str = str.concat(type + " ");
        }
        str = "$" + id ;
        return str;
    }
}
