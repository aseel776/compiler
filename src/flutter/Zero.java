package flutter;

public class Zero extends PaddingValues {

    @Override
    public String toString() {
        return "values: Values.zero";
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("values").append("\n\t\t").append(this);
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("PaddingValues Zero", this.hashCode());
        top=Utils.addClassToParentElementByScript(top, "p-0");
        return top;
    }
}