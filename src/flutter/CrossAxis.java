package flutter;

public class CrossAxis extends Column_rowAtt{

    public String al ;

    public CrossAxis(String  al){
        this.al=al;
    }

    @Override
    public String toString() {
        return "crossAxisAlignment:" + al;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("cross axis alignment");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top= Utils.setCommentWidgetName("CrossAxis", this.hashCode());

        // Add a class to the parent element <div class="d-flex flex-column|row + ></div>"
        top=Utils.addClassToParentElementByScript(top, "align-items-"+al);
        return top;
    }
}
