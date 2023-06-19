package nodes;

public class InitialConditionVariable extends InitialCondition{

    public Variable id;

    public InitialConditionVariable(Variable id){
        this.id = id;
    }

    @Override
    public String toString() {
        return id.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("initial condition");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = id.codeGenerationImp();
        return str ;
    }
}
