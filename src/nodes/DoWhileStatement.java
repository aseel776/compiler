package nodes;

public class DoWhileStatement extends WhileStatement{

    public DoWhileStatement(Condition condition, Block block){
        super(condition, block);
    }

    @Override
    public String toString() {
        return "do" + '\n' + block.toString() + "while" + '(' + condition.toString() + ");" ;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("do");
        str.append("\n\t\t").append(block.astImp());
        str.append("\n\t\twhile ").append(condition.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "do" + '\n' + block.codeGenerationImp() + "while" + '(' + condition.codeGenerationImp() + ");" ;
        return str;
    }
}
