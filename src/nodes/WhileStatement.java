package nodes;

public class WhileStatement extends Statement{

    public Condition condition;
    public Block block;

    public WhileStatement(Condition condition, Block block){
        this.condition = condition;
        this.block = block;
    }

    @Override
    public String toString() {
        return "while" + '(' + condition.toString() + ')' + '\n' + block.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("while");
        str.append("\n\t\t").append(condition.astImp());
        str.append("\n\t\t").append(block.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "while" + '(' + condition.codeGenerationImp() + ')' + '\n' + block.codeGenerationImp();
        return str;
    }
}
