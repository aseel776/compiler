package flutter;

import nodes.ZeroParameters;

public class Padding extends Component{

    public PaddingAtts paddingAtts;

    public Padding(PaddingAtts paddingAtts) {
        super("Padding", paddingAtts);
        this.paddingAtts = paddingAtts;
    }

    public Padding(){
        super("Padding", new ZeroParameters());
    }

    @Override
    public String toString() {
        if(paddingAtts != null){
            return "new Padding (\n" + paddingAtts.toString() + "\n)";
        }else{
            return "new Padding ()";
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("padding");
        if(paddingAtts != null){
            str.append("\n\t\t").append(paddingAtts.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("Padding", this.hashCode());
        top =top.concat("<div>");
        top =top.concat("\n");
        top =top.concat(paddingAtts.codeGenerationImp());
        top =top.concat("\n");
        top =top.concat("</div>");
        return top;
    }
}
