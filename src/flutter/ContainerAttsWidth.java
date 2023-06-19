package flutter;

import nodes.DartInteger;

public class ContainerAttsWidth extends ContainerAtt{

    public DartInteger number ;
    public ContainerAttsWidth(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "containerWidth:"+number.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("container width");
        str.append("\n\t\t").append(this);
        return str;
    }

    // CSS
    // may remove css style and do another thing
    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("ContainerAttsWidth", this.hashCode());

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
