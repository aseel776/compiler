package flutter;

import nodes.Parameters;

import java.util.ArrayList;
import java.util.List;

public class InkwellAtts extends Parameters {

    List<InkWellAtt> atts;

    public InkwellAtts(List<InkWellAtt> atts){
        this.atts = atts;
    }

    public InkwellAtts(){
        atts = new ArrayList<>();
    }

    public void addAtt(InkWellAtt att){
        atts.add(att);
    }

    @Override
    public String toString() {
        String top = "";
        for (int i = 0; i < atts.size(); i++) {
            if (i == atts.size() - 1) {
                top = top.concat(atts.get(i).toString() + "\n");
            } else {
                top = top.concat(atts.get(i).toString() + "," + "\n");
            }
        }
        return top;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("inkwell atts");
        for (InkWellAtt att: atts){
            str.append("\n\t\t").append(att.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("InkwellAtts", this.hashCode());
        for (int i = 0; i < atts.size(); i++) {
            top = top.concat(atts.get(i).codeGenerationImp());
            top =top.concat("\n");
        }
        return top;
    }
}
