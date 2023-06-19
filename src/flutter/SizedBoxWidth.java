package flutter;

import nodes.DartInteger;

public class SizedBoxWidth extends SizedBoxAtt{

    public DartInteger number ;

    public SizedBoxWidth(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "sizedBoxWidth:" + number.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("sizedBox width");
        str.append("\n\t\t").append(this);
        return str;
    }

    // may remove css style and do another thing
    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("SizedBoxWidth", this.hashCode());

        top =top.concat("<script>");
        top =top.concat("\n");
        top =top.concat("var parentDiv = document.currentScript.parentNode;");
        top =top.concat("\n");
        top =top.concat("  parentDiv.style.width = '" + number + "px';");
        top =top.concat("\n");
        top =top.concat("</script>");
        return top;
    }
}