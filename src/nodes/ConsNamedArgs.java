package nodes;

import java.util.List;

public class ConsNamedArgs extends ConsArgs{

    public List<ConsNamedArg> args;

    public ConsNamedArgs(List<ConsNamedArg> args){
        this.args = args;
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
        StringBuilder str = new StringBuilder("constructor named arguments");
        for (ConsNamedArg c: args) {
            str.append("\n\t\t").append(c.astImp());
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
