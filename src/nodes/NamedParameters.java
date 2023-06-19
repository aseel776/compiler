package nodes;

import java.util.List;

public class NamedParameters extends Parameters{

    public List<NamedParameter> parameters;

    public NamedParameters(List<NamedParameter> parameters){
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        String pars = "(";
        for (int i = 0; i < parameters.size(); i++){
            if(i == parameters.size() - 1){
                pars = pars.concat(parameters.get(i).toString() + ")");
            }else{
                pars = pars.concat(parameters.get(i).toString() + ", ");
            }
        }
        return pars;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("named parameters");
        for (NamedParameter p: parameters) {
            str.append("\n\t\t").append(p.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "(";
        for (int i = 0; i < parameters.size(); i++){
            if(i == parameters.size() - 1){
                str = str.concat(parameters.get(i).codeGenerationImp() + ")");
            }else{
                str = str.concat(parameters.get(i).codeGenerationImp() + ", ");
            }
        }
        return str;

    }
}
