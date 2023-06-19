package flutter;

import nodes.UnnamedFunction;

public class Button_OnTap_unnamedFunction extends Button_OnTap{

   public UnnamedFunction unnamedFunction;
   public Button_OnTap_unnamedFunction(UnnamedFunction unnamedFunction){
       this.unnamedFunction=unnamedFunction;
   }

    @Override
    public String toString() {
        return "buttonOnTap: " + unnamedFunction.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("button on tap");
        str.append("\n\t\t").append(unnamedFunction.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String args = unnamedFunction.codeGenerationImp();
        return args;
    }
}
