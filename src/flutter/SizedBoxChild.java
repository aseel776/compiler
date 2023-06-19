package flutter;


import nodes.DartObject;


public class SizedBoxChild extends SizedBoxAtt{

    DartObject object;

    public SizedBoxChild(DartObject object){
        this.object=object;
    }

    @Override
    public String toString() {
        return "sizedBoxChild:" +object.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("sizedBox child");
        str.append("\n\t\t").append(object.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("SizedBoxChild", this.hashCode());
        top =top.concat(object.codeGenerationImp());
        return top;
    }
}