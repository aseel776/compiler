package flutter;


import nodes.ZeroParameters;

public class Stack extends Component{

    public StackAtts stackAtts;
    public Stack(StackAtts atts){
        super("Stack", atts);
        this.stackAtts= atts;
    }

    public Stack(){
        super("Stack", new ZeroParameters());
    }

    @Override
    public String toString() {
        if(stackAtts != null){
            return "new Stack(\n"+ stackAtts.toString()+"\n);";
        }else{
            return "new Stack ();";
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("stack");
        if(stackAtts != null){
            str.append("\n\t\t").append(stackAtts.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("Stack", this.hashCode());

        String classes[] = { "position-relative", "" };

        top =top.concat("<div" + Utils.setClassesNames(classes) + ">");
        top =top.concat("\n");
        top =top.concat(stackAtts.codeGenerationImp());
        top =top.concat("\n");
        top =top.concat("</div>");

        return top;

    }
}

