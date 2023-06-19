package flutter;

import nodes.DartInteger;

public class Top extends CostumeValues{

    DartInteger number;

    public Top(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "top:"+number.toString();
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder(toString());
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("Top", this.hashCode());
        top = Utils.addClassToParentElementByScript(top, "pt-" + number);
        return top;
    }
}
