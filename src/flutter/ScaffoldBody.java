package flutter;

import nodes.DartObject;

public class ScaffoldBody extends ScaffoldAtt{

    public DartObject object ;


    public  ScaffoldBody(DartObject object ){
        super();
        this.object= object;
    }

    @Override
    public String toString() {
        return "body:" + object.toString() ;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("scaffold body");
        str.append("\n\t\t").append(object.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("ScaffoldBody", this.hashCode());

        top =top.concat(object.codeGenerationImp());

        return top;
    }
}
