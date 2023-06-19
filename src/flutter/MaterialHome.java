package flutter;

import nodes.DartObject;

public class MaterialHome extends MaterialAppAtt{
    public DartObject object ;

    public  MaterialHome(DartObject object ){
        super();
        this.object= object;
    }

    @Override
    public String toString() {
        return "home:" + object.toString() ;
    }

//    @Override
//    public String astImp() {
//        String str = "material home";
//        str = str.concat("\n\t\t" + object.astImp());
//        return str;
//    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("material home");
        str.append("\n\t\t").append(object.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("MaterialHome", this.hashCode());
        top =top.concat("<div>");
        top =top.concat("\n");
        top =top.concat(object.codeGenerationImp());
        top =top.concat("\n");
        top =top.concat("</div>");
        return top;
    }
}

