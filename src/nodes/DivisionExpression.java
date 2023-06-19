package nodes;

public class DivisionExpression extends Expression{

    public Expression left;
    public Expression right;

    public DivisionExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + '/' + right.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("division");
        str.append("\n\t\t").append(left.astImp());
        str.append("\n\t\t/");
        str.append("\n\t\t").append(right.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = left.codeGenerationImp() + '/' + right.codeGenerationImp();
        return str;
    }
}
