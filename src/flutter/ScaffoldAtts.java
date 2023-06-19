package flutter;

import nodes.Parameters;
import java.util.ArrayList;
import java.util.List;

public class ScaffoldAtts extends Parameters {
    public List<ScaffoldAtt> atts;

    public ScaffoldAtts(List<ScaffoldAtt> atts){
        this.atts = atts;
    }

    public ScaffoldAtts(){
        atts = new ArrayList<>();
    }

    public void addAtt(ScaffoldAtt att){
        atts.add(att);
    }

    @Override
    public String toString() {
        String top = "";
        for (int i = 0; i < atts.size(); i++){
            if(i == atts.size() - 1){
                top = top.concat(atts.get(i).toString()+ "\n");
            }else {
                top = top.concat(atts.get(i).toString()+","+ "\n");
            }
        }
        return top;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("scaffold atts");
        for(ScaffoldAtt att:atts){
            str.append("\n\t\t").append(att.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("ScaffoldAtts", this.hashCode());

        String styles[] = { "width : 300px", "height : 600px" , "background : red" };

        top =top.concat("<div " + Utils.setStyles(styles) + ">");
        top.concat("\n");
        for (int i = 0; i < atts.size(); i++) {
            top = top.concat(atts.get(i).codeGenerationImp());
            top =top.concat("\n");
        }
        top =top.concat("</div>");
        return top;
    }
}
