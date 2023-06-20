package flutter;

import nodes.DartObject;

public class ScrollViewChild extends ScrollViewAtt{

    public DartObject object;

    public ScrollViewChild(DartObject object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return  "scrollChild: "+ object.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("scroll view child");
        str.append("\n\t\t").append(object.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        return object.codeGenerationImp();
    }
}

