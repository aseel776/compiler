package flutter;

import nodes.DartInteger;

public class All extends PaddingValues {

     public DartInteger number;
    public All(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "values: Values.all("+number.toString() +")";
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("values");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("All", this.hashCode());
        top = Utils.addClassToParentElementByScript(top, "p-" + number);
        return top;
    }
}



