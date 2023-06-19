package nodes;

public class Condition extends Node{

    public Comparison comparison;
    public Boolean value;

    public Condition(Comparison comp){
        this.comparison = comp;
    }

    @Override
    public String toString() {
        return comparison.toString();
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("condition").append("\n\t\t").append(comparison.astImp());
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = str.concat(comparison.codeGenerationImp());
        return str;
    }
}
