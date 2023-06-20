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
        String top ="";

        top=top.concat("<script>");

        top=top.concat("var parentDiv = document.currentScript.parentNode;");

        top=top.concat("parentDiv.addEventListener('click',"+ unnamedFunction.toJs()+");" );

        top=top.concat("</script>");

        return top;
    }
}
