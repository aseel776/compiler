package nodes;

public class NamedArgument extends Argument{

    public Boolean isRequired;

    public NamedArgument(String type, String id, Boolean isRequired){
        super(type, id);
        this.isRequired = isRequired;
    }

    @Override
    public String toString() {
        if(isRequired){
            if(type != null){
                return "required" + " " + type + " " + id;
            }else {
                return "required" + " " + id;
            }
        }else {
            if(type != null){
                return type + " " + id;
            }else {
                return id;
            }
        }
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("named arg").append("\n\t\t").append(this);
    }
}
