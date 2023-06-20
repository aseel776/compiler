package flutter;

public class MainAxis extends Column_rowAtt {

    public String al;

    public MainAxis(String al) {
        this.al = al;
    }

    @Override
    public String toString() {
        return "mainAxisAlignment:" + al;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("main axis alignment");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        System.out.println(al);
        String str = "";
        if (al.equalsIgnoreCase("spaceBetween")) {
            str = str.concat("'justify-content-between'");
        } else if (al.equalsIgnoreCase("spaceEvenly")) {
            str=str.concat( "'justify-content-between'") ;

        }
        else {
              str=str.concat( "'justify-content-" + al+"'");

        }
        String top = Utils.setCommentWidgetName("MainAxis", this.hashCode());
        // Add a class to the parent element <div class="d-flex flex-column|row></div>"
        top = Utils.addClassToParentElementByScript(top, str);
        return top;
    }
}
