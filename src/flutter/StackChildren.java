package flutter;

import nodes.DartList;

public class StackChildren extends StackAtt{

    public DartList list ;

    public StackChildren(DartList list){
        this.list=list;
    }

    @Override
    public String toString() {
        return "stackChildren:"+ list.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("stack children");
        str.append("\n\t\t").append(list.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        // TOOO
        // add top and left right bottom when find there classes
        // by add script inside there to inject class by js in parent (this div)
        String classes []= {"position-absolute", ""};
        String top = Utils.setCommentWidgetName("StackChildren", this.hashCode());
        top =top.concat("<div"+Utils.setClassesNames(classes)+">");
        top =top.concat("\n");
        top =top.concat(list.codeGenerationImp());
        top =top.concat("\n");
        top =top.concat("</div>");
        return top;
    }
}
