package flutter;

import nodes.DartInteger;

public class Left extends CostumeValues{


    public DartInteger number;
    public Left(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "left:"+number.toString();
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder(toString());
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("Left", this.hashCode());
        top = Utils.addClassToParentElementByScript(top, "pl-" + number);
        return top;
    }
}
