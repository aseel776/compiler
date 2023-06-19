package nodes;

public class ConsPositionalNamedArgs extends ConsArgs{

    public ConsPositionalArgs posArgs;
    public ConsNamedArgs namedArgs;

    public ConsPositionalNamedArgs(ConsPositionalArgs posArgs, ConsNamedArgs namedArgs){
        this.posArgs = posArgs;
        this.namedArgs = namedArgs;
    }

    @Override
    public String toString() {
        String args = "(";
        for (int i = 0; i < posArgs.args.size(); i++){
            args = args.concat(posArgs.args.get(i).toString() + ", ");
        }
        for (int i = 0; i < namedArgs.args.size(); i++){
            if(namedArgs.args.size() == 1){
                args = args.concat("{ " + namedArgs.args.get(i).toString() + " })");
            }
            else if(i == 0){
                args = args.concat("{ " + namedArgs.args.get(i).toString() + ", ");
            } else if (i == namedArgs.args.size() - 1) {
                args = args.concat(namedArgs.args.get(i).toString() + " })");
            }else {
                args = args.concat(namedArgs.args.get(i).toString() + ", ");
            }
        }
        return args;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("constructor positional named arguments");
        str.append("\n\t\t").append(posArgs.astImp());
        str.append("\n\t\t").append(namedArgs.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "(";
        for (int i = 0; i < posArgs.args.size(); i++){
            str = str.concat(posArgs.args.get(i).codeGenerationImp() + ", ");
        }
        for (int i = 0; i < namedArgs.args.size(); i++){
            if (i == namedArgs.args.size() - 1) {
                str = str.concat(namedArgs.args.get(i).codeGenerationImp() + " )");
            }else {
                str = str.concat(namedArgs.args.get(i).codeGenerationImp() + ", ");
            }
        }
        return str;
    }
}
