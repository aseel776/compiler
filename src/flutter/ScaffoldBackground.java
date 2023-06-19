package flutter;

public class ScaffoldBackground extends ScaffoldAtt{

    public String color;

    public ScaffoldBackground(String color){
        super();
        this.color= color;
    }
    @Override
    public String toString() {

        return "backgroundColor:"+color.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("scaffold background color");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        // String classes[] = {/"bg-" + color + "')", "w-100", "h-100" };

        String top = Utils.setCommentWidgetName("ScaffoldBackground", this.hashCode());
        top=top.concat("<script>\n");
        
        top=top.concat("var parentDiv = document.currentScript.parentNode;\n");
        top=top.concat("parentDiv = parentDiv.parentNode;\n");
        top=top.concat("parentDiv = parentDiv.parentNode;\n");
        
        top=top.concat("parentDiv.classList.add(" + "'bg-"+Utils.getBootstrapColor(color) +"'" + ")\n");
        
        top=top.concat("</script>\n");

        top=top.concat(Utils.addClassToParentElementByScript(top, "'bg-"+Utils.getBootstrapColor(color) +"'"));
    
        return top;
    }
}
