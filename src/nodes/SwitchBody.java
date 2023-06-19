package nodes;

import java.util.ArrayList;
import java.util.List;

public class SwitchBody extends Node{
    public List<Case> cases;
    public DefaultCase defaultCase;

    public SwitchBody(List<Case> cases, DefaultCase defaultCase){
        this.cases = cases;
        this.defaultCase = defaultCase;
    }

    public SwitchBody(DefaultCase defaultCase){
        cases = new ArrayList<>();
        this.defaultCase = defaultCase;
    }

    public void addCase(Case aCase){
        cases.add(aCase);
    }

    @Override
    public String toString() {
        String body = new String("{ \n");
        for (Case aCase: cases) {
            body = body.concat(aCase.toString() + '\n');
        }
        body = body.concat(defaultCase.toString() + '\n');
        body = body.concat("}");
        return body;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("switch body");
        for(Case c : cases){
            str.append("\n\t\t").append(c.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "{ \n";
        for (Case aCase :cases) {
            str = str.concat(aCase.codeGenerationImp() + '\n') ;
        }
        str = str.concat(defaultCase.codeGenerationImp() + '\n');
        str = str.concat("}");
        return str;
    }
}
