package nodes;

public class Comparison extends Node{
    public Variable left;
    public Expression right;
    public String symbol;

    public Comparison(Variable left, Expression right, String symbol){
        this.left = left;
        this.right = right;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return left.toString() + symbol + right.toString();
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder(toString());
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = str.concat(left.codeGenerationImp());
        str = str.concat(symbol);
        str = str.concat(right.codeGenerationImp());
        return str;
    }
}
