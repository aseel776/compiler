package flutter;

import nodes.Parameters;
import java.util.ArrayList;
import java.util.List;

public class PaddingAtts extends Parameters {

    public List<PaddingAtt> atts;

    public PaddingAtts(List<PaddingAtt> atts){
        this.atts = atts;
    }

    public PaddingAtts(){
        atts = new ArrayList<>();
    }

    public void addAtt(PaddingAtt att){
        atts.add(att);
    }

    @Override
    public String toString() {
        String top = "";
        for (int i = 0; i < atts.size(); i++) {
            if (i == atts.size() - 1) {
                top = top.concat(atts.get(i).toString());
            } else {
                top = top.concat(atts.get(i).toString() + "," + "\n");
            }
        }
        return top;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("padding atts");
        for(PaddingAtt att: atts){
            str.append("\n\t\t").append(att.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("PaddingAtts", this.hashCode());
        for (int i = 0; i < atts.size(); i++) {
            top = top.concat(atts.get(i).codeGenerationImp());
            top =top.concat("\n");
        }
        return top;

    }
}
