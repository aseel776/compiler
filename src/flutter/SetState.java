package flutter;

import nodes.Block;
import nodes.Statement;

public class SetState extends Statement {

    public Block block;

    public SetState (Block block){
        this.block = block;
    }

    @Override
    public String toString() {
        String str = "setState(()";
        str = str.concat(block.toString() + ")");
        return str;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("setState");
        str.append("\n\t\t").append(block.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        return null;
    }
}
