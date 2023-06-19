package nodes;

public class DartDouble extends Number {

    public double num;

    public DartDouble(double num){
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("double").append("\n\t\t").append(this);
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = String.valueOf(num);
        return str;
    }
}
