package flutter;

import nodes.Node;
import nodes.ZeroParameters;

public class Text extends Component {

    public Node text;

    public TextAtts textAtts;

    public Text(Node text, TextAtts atts) {
        super("Text", atts);
        this.text =text;
        this.textAtts = atts;
    }

    public Text(Node text){
        super("Text", new ZeroParameters());
        this.text = text;
    }

    @Override
    public String toString() {
        if(textAtts != null){
            return "new Text (\n" + text + '\n' + textAtts.toString() + ")";
        }else{
            return "new Text (\n" + text + "\n)";
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("text");
        str.append("\n\t\t").append(text);
        if(textAtts != null){
            str.append("\n\t\t").append(textAtts.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {

        String top  = Utils.setCommentWidgetName("Text", this.hashCode());
        top =top.concat("<div>");
        String editedText = text.toJs().replace('\'', ' ');
        top =top.concat(editedText);
        if(textAtts!= null){
            top =top.concat(textAtts.codeGenerationImp());
        }
        top =top.concat("</div>");
        return top;


    }
}