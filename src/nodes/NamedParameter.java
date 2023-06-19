package nodes;

public class NamedParameter extends Parameter{

    public String id;

    public NamedParameter(String id, Node value){
        super(value);
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ":" + " " + value.toString();
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("named parameter").append("\n\t\t").append(this);
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = id + ":" + " " + value.codeGenerationImp();
        return str ;
    }
}
