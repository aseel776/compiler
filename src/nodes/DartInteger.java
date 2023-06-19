package nodes;

public class DartInteger extends Number {

    public int number;

    public DartInteger(int number){
        this.number = number ;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("int").append("\n\t\t").append(this);
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = String.valueOf(number);
        return str;
    }
}
