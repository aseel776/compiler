package nodes;

public class SwitchStatement extends Statement{

    public Variable id;
    public SwitchBody body;

    public SwitchStatement(Variable id, SwitchBody body){
        this.id = id;
        this.body = body;
    }

    @Override
    public String toString() {
        return "switch" + '(' + id + ')' + body.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("switch");
        str.append("\n\t\t").append(id);
        str.append("\n\t\t").append(body.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "switch" + '(' + id.codeGenerationImp() + ')' +  body.codeGenerationImp();
        return str;
    }
}
