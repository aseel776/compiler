package nodes;

public abstract class Case extends Node{
    public CaseBody caseBody;

    public Case(CaseBody caseBody){
        this.caseBody = caseBody;
    }
}
