package flutter;

import nodes.ZeroParameters;


public class InkWell extends Component{

    public InkwellAtts inkwellAtts ;

    public InkWell(InkwellAtts inkwellAtts){
        super("InkWell", inkwellAtts);
        this.inkwellAtts= inkwellAtts;
    }

    public InkWell(){
        super("InkWell", new ZeroParameters());
    }

    @Override
    public String toString() {
        if(inkwellAtts != null){
            return "new InkWell (\n" + inkwellAtts.toString() + ")";
        }else {
            return "new InkWell ()";
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("inkwell");
        if(inkwellAtts != null){
            str.append("\n\t\t").append(inkwellAtts.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("InkWell", this.hashCode());
        top =top.concat("<button>");
        top =top.concat("\n");
        top =top.concat(inkwellAtts.codeGenerationImp());
        top =top.concat("\n");
        top =top.concat("</button>");
        return top;
    }
}
