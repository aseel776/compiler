package nodes;

public class ForStatement extends Statement{

    public InitialCondition initialCondition;
    public Condition stopCondition;
    public Increment increment;
    public Block block;

    public ForStatement(InitialCondition initialCondition, Condition stopCondition, Increment increment, Block block){
        this.initialCondition = initialCondition;
        this.stopCondition = stopCondition;
        this.increment = increment;
        this.block = block;
    }

    @Override
    public String toString() {
        return "for" + '('
                + initialCondition.toString() + ';'
                + stopCondition.toString() + ';'
                + increment.toString() + ')'
                + '\n' + block.toString()
                ;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("for");
        str.append("\n\t\t").append(initialCondition.astImp());
        str.append("\n\t\t").append(stopCondition.astImp());
        str.append("\n\t\t").append(increment.astImp());
        str.append("\n\t\t").append(block.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "for" + '('
                + initialCondition.codeGenerationImp() + ';'
                + stopCondition.codeGenerationImp() + ';'
                + increment.codeGenerationImp() + ')'
                + '\n' + block.codeGenerationImp()
        ;
        return str;
    }
}
