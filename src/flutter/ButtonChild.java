package flutter;

import nodes.DartObject;

public class ButtonChild extends ButtonAtt{

    DartObject object;

    public ButtonChild(DartObject object){
        this.object=object;
    }

    @Override
    public String toString() {
        return "buttonChild:" +object.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("button child");
        str.append("\n\t\t").append(object.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("ButtonChild", this.hashCode());
        top.concat(object.codeGenerationImp());
        top =top.concat("\n");
        return top;
    }
}
