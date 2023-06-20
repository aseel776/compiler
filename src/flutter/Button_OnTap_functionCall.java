package flutter;

import nodes.FunctionCall;

public class Button_OnTap_functionCall extends Button_OnTap{

    public FunctionCall functionCall;
    public Button_OnTap_functionCall(FunctionCall functionCall){
        this.functionCall=functionCall;
    }

    @Override
    public String toString() {
        return "buttonOnTap: " + functionCall.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("button on tap");
        str.append("\n\t\t").append(functionCall.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top ="";

        top=top.concat("<script src='functions/"+functionCall.id+".js'></script>");
        top=top.concat("<script>");

        top=top.concat("var parentDiv = document.currentScript.parentNode;");

        top=top.concat("parentDiv.addEventListener('click', ()=>"+ functionCall.toJs()+");" );

        top=top.concat("</script>");

        return top;
    }
}
