package nodes;

public class DefaultCase extends Case{

    public DefaultCase(CaseBody caseBody){
        super(caseBody);
    }

    @Override
    public String toString() {
        return "default: " + caseBody.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("default case");
        str.append("\n\t\t").append(caseBody.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "default:" + caseBody.codeGenerationImp();
        return str;
    }
}
