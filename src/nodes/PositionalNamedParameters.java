package nodes;

public class PositionalNamedParameters extends Parameters{
    public PositionalParameters positionalParameters;
    public NamedParameters namedParameters;

    public PositionalNamedParameters(PositionalParameters positionalParameters, NamedParameters namedParameters){
        this.positionalParameters = positionalParameters;
        this.namedParameters = namedParameters;
    }

    @Override
    public String toString() {
        String pars = "(";
        for (int i = 0; i < positionalParameters.parameters.size(); i++){
            pars = pars.concat(positionalParameters.parameters.get(i).toString() + ", ");
        }
        for (int i = 0; i < namedParameters.parameters.size(); i++){
            if(namedParameters.parameters.size() == 1 || i == namedParameters.parameters.size() - 1){
                pars = pars.concat(namedParameters.parameters.get(i).toString() + " )");
            }else {
                pars = pars.concat(namedParameters.parameters.get(i).toString() + ", ");
            }
        }
        return pars;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("positional named parameters");
        str.append("\n\t\t").append(positionalParameters.astImp());
        str.append("\n\t\t").append(namedParameters.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "(...[";
        for (int i = 0; i < positionalParameters.parameters.size(); i++){
            str = str.concat(positionalParameters.parameters.get(i).codeGenerationImp() + ", ");
        }
        for (int i = 0; i < namedParameters.parameters.size(); i++){
            if(namedParameters.parameters.size() == 1 || i == namedParameters.parameters.size() - 1){
                str = str.concat(namedParameters.parameters.get(i).codeGenerationImp() + " ])");
            }else {
                str = str.concat(namedParameters.parameters.get(i).codeGenerationImp() + ", ");
            }
        }
        return str;

    }
}
