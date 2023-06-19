package flutter;

import nodes.UnnamedFunction;

public class Inkwell_OnTap_UnnamedFunction extends Inkwell_OnTap{

    public UnnamedFunction unnamedFunction;

    public Inkwell_OnTap_UnnamedFunction(UnnamedFunction unnamedFunction){
        this.unnamedFunction=unnamedFunction;
    }

    @Override
    public String toString() {
        return "inkWellOnTap:" + unnamedFunction.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("inkwell on tap");
        str.append("\n\t\t").append(unnamedFunction.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        // TODO Auto-generated method stub
        return null;
    }
}
