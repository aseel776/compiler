package nodes;

public class Initialization extends Node{

    public Node value;

    public Initialization(Node value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "= " + value.toString();
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("initialization").append("\n\t\t").append(value.astImp());
    }

    @Override
    public String codeGenerationImp() {
        String str = "= ";
        str = str.concat(value.codeGenerationImp());
        return str;
    }
}
