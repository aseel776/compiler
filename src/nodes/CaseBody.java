package nodes;

public class CaseBody extends Block{

    public Boolean containsBreak;

    public CaseBody(Boolean containsBreak){
        super();
        this.containsBreak = containsBreak;
    }

    @Override
    public String toString() {
        String body = "\n";
        for (Node n : statements) {
            body = body.concat(n.toString() + '\n');
        }
        if(containsBreak){
            body = body.concat("break;");
        }
        return body;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("case body");
        for (Node n: statements) {
            str.append("\n\t\t").append(n.astImp());
        }
        if(containsBreak){
            str.append("\n\t\tbreak");
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "\n";
        for (Node n : statements) {
            str = str.concat(n.codeGenerationImp() + "\n");
        }
        if(containsBreak){
            str = str.concat("break;");
        }
        return str;
    }
}