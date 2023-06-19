package nodes;

public class ConsNamedArg extends ConsArg {
    public Boolean isRequired;

    public ConsNamedArg(Boolean isRequired, String type, String id){
        super(type, id);
        this.isRequired = isRequired;
    }

    @Override
    public String toString() {
        String arg = isRequired ? "required " : "" ;
        if(type != null){
            if(type.compareTo("this") == 0){
                arg = arg.concat("this." + id);
            }else{
                arg = arg.concat(type.toString() + " " + id);
            }
        }else{
            arg = arg.concat(id);
        }
        return arg;
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("constructor named arg").append("\n\t\t").append(this);
    }
}
