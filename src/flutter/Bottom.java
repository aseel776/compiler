package flutter;

import nodes.DartInteger;

public class Bottom extends CostumeValues{

    public DartInteger number;
    public Bottom(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "bottom:"+number.toString();
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder(toString());
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("Bottom", this.hashCode());
        top = Utils.addClassToParentElementByScript(top, "pb-" + number);
        return top;
    }
}
