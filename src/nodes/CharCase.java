package nodes;

public class CharCase extends Case{

    public String str;

    public CharCase(String str, CaseBody caseBody){
        super(caseBody);
        this.str = str;
    }

    @Override
    public String toString() {
        return "case " + "\"" + str + "\"" + ':' + caseBody.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder ("case");
        str.append("\n\t\t").append(this);
        str.append("\n\t\t").append(caseBody.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String strCase;
        strCase = "case " + "\"" + str + "\"" + ':' + caseBody.codeGenerationImp();
        return strCase;
    }
}
