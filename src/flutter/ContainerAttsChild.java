package flutter;

import nodes.DartObject;

public class ContainerAttsChild extends ContainerAtt{

    public DartObject object;

    public ContainerAttsChild(DartObject object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return  "containerChild: " + object.toString();

    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("container child");
        str.append("\n\t\t").append(object.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("ContainerAttsChild", this.hashCode());
        top =top.concat(object.codeGenerationImp());
        return top;
    }
}
