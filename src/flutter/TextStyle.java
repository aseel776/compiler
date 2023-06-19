package flutter;

public class TextStyle extends TextAtt {
    public String style;

    public TextStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "textStyle: " + style;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("text style");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("TextStyle", this.hashCode());


        String className;
        if (style == "Italic")
            className = "fst-italic";
        else if (style == "Bold")
            className = "fw-bold";
        else
            className = ""; //   // TODO fst-italic fw-bold

        top = Utils.addClassToParentElementByScript(top, className);


        return top;

    }
}
