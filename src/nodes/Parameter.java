package nodes;

public class Parameter extends Node{

    public Node value;

    public Parameter(Node value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("parameter").append("\n\t\t").append(this);
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = value.codeGenerationImp();
        return str;
    }
}
