package nodes;

import java.util.List;

public class ConsPositionalArgs extends ConsArgs{

    public List<ConsArg> args;

    public ConsPositionalArgs(List<ConsArg> args){
        this.args = args;
    }

    @Override
    public String toString() {
        String posArgs = "(";
        for (int i = 0; i < args.size(); i++){
            if(i == args.size() - 1){
                posArgs = posArgs.concat(args.get(i).toString());
            }else {
                posArgs = posArgs.concat(args.get(i).toString() + ", ");
            }
        }
        posArgs = posArgs.concat(")");
        return posArgs;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("constructor positional arguments");
        for (ConsArg c: args) {
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
