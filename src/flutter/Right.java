package flutter;

import nodes.DartInteger;

public class Right  extends CostumeValues {

    public DartInteger number;

    public Right(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "right:"+number.toString();
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder(toString());
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("Right", this.hashCode());
        top = Utils.addClassToParentElementByScript(top, "pr-" + number);
        return top;
    }
}