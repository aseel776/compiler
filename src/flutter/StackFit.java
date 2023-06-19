package flutter;

public class StackFit extends StackAtt{

    public String stackFit ;

    public StackFit(String stackFit ){
        this.stackFit= stackFit;
    }

    @Override
    public String toString() {
        return  "fit: " + stackFit;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("stack fit");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        //TODO
        String top = Utils.setCommentWidgetName("stackFit", this.hashCode());
        top =top.concat("<!-- not found in bootstrap-->");
        return top;
    }
}
