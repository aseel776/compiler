package nodes;

public class    NumberCase extends Case{
    public Number number;

    public NumberCase(Number number, CaseBody caseBody){
        super(caseBody);
        this.number = number;
    }

    @Override
    public String toString() {
        return "case " + number.toString() + ':' + caseBody.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("case");
        str.append("\n\t\t").append(this);
        str.append("\n\t\t").append(caseBody.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "case " + number.codeGenerationImp() + ':' + caseBody.codeGenerationImp();
        return str;
    }
}
