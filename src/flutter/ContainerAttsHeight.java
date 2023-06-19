package flutter;

import nodes.DartInteger;

public class ContainerAttsHeight extends ContainerAtt{

    public DartInteger number ;
    public ContainerAttsHeight(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "containerHeight:"+number.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("container height");
        str.append("\n\t\t").append(this);
        return str;
    }

    // CSS
    // may remove css style and do another thing
    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("ContainerAttsHeight", this.hashCode());

        top =top.concat("<script>");
        top =top.concat("\n");
        top =top.concat("var parentDiv = document.currentScript.parentNode;");
        top =top.concat("\n");
        top =top.concat("  parentDiv.style.height  = '" + number + "px';");
        top =top.concat("\n");
        top =top.concat("</script>");
        return top;
    }
}
