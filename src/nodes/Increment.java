package nodes;

public class Increment extends Node{

    public Variable id;
    public String symbol;
    public Expression expression;

    public Increment(Variable id, String symbol, Expression expression){
        this.id = id;
        this.symbol = symbol;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return id.toString() + symbol + expression.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("increment");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "$" + id.codeGenerationImp() + symbol + expression.codeGenerationImp();
        return str;
    }
}
