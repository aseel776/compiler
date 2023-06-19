package flutter;

import nodes.DartObject;

public class PaddingChild extends PaddingAtt{

    public DartObject object ;

    public PaddingChild(DartObject object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "paddingChild: " +object.toString() ;

    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("padding child");
        str.append("\n\t\t").append(object.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("PaddingChild", this.hashCode());
        top =top.concat(object.codeGenerationImp());
        top =top.concat("\n");
        return top;
    }
}
