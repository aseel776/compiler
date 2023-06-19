package flutter;

import nodes.DartInteger;

public class TextSize extends TextAtt {

    public DartInteger number;

    public TextSize(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "textSize:" + number.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("text size");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("TextSize", this.hashCode());
        top = top.concat("<script> \n");
        top = top.concat("var parentDiv = document.currentScript.parentNode; \n");
        top = top.concat("parentDiv.style.fontSize(" + number + "px" + ") \n");
        top = top.concat("</script> \n");
        return top;
    }
}
