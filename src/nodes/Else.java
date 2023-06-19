package nodes;

public class Else extends Node{

    public Block block;

    public Else(Block block){
        this.block = block;
    }

    @Override
    public String toString() {
        return "else" + '\n' + block.toString();
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("else").append("\n\t\t").append(block.astImp());
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "else" + '\n' + block.codeGenerationImp();
        return str;
    }
}
