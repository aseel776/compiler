package flutter;

import nodes.Parameters;
import java.util.ArrayList;
import java.util.List;

public class ButtonAtts extends Parameters {

    public List<ButtonAtt> atts;

    public ButtonAtts(List<ButtonAtt> atts){
        this.atts = atts;
    }

    public ButtonAtts(){
        atts = new ArrayList<>();
    }

    public void addAtt(ButtonAtt att){
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
        StringBuilder str = new StringBuilder("button atts");
        for (ButtonAtt b: atts) {
            str.append("\n\t\t").append(b.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("ButtonAtts", this.hashCode());
        for (int i = 0; i < atts.size(); i++) {
            top = top.concat(atts.get(i).codeGenerationImp());
            top =top.concat("\n");
        }
        return top;
    }
}