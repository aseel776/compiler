package nodes;

import java.util.List;

public class NamedArguments extends Arguments{

    public List<NamedArgument> args;

    public NamedArguments(List<NamedArgument> args){
        this.args = args;
    }

    @Override
    public void check(int line) {
        for (Argument arg: args) {
            arg.check(line);
        }
    }

    @Override
    public String toString() {
        String namedArgs = "({";
        for (int i = 0; i < args.size(); i++){
            if(i == args.size() - 1){
                namedArgs = namedArgs.concat(args.get(i).toString());
            }else {
                namedArgs = namedArgs.concat(args.get(i).toString() + ", ");
            }
        }
        namedArgs = namedArgs.concat("})");
        return namedArgs;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("named arguments");
        for (NamedArgument arg: args) {
            str.append("\n\t\t").append(arg.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "(";
        for (int i = 0; i < args.size(); i++){
            if(i == args.size() - 1){
                str = str.concat(args.get(i).codeGenerationImp());
            }else {
                str = str.concat(args.get(i).codeGenerationImp() + ", ");
            }
        }
        str = str.concat(")");
        return str;

    }
}
