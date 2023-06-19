package flutter;

public class TextAtts_Color extends TextAtt {

    public String color;

    public TextAtts_Color(String color) {
        this.color = color;

    }

    @Override
    public String toString() {
        return "textColor: " + color;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("text color");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("TextAtts_color", this.hashCode());
        top = Utils.addClassToParentElementByScript(top, "text-"+Utils.getBootstrapColor(color));
        return top;
    }
}
