package flutter;


import nodes.Parameters;
import java.util.ArrayList;
import java.util.List;

public class SizedBoxAtts extends Parameters {

    public List<SizedBoxAtt> atts;

    public SizedBoxAtts(List<SizedBoxAtt> atts){
        this.atts = atts;
    }

    public SizedBoxAtts(){
        atts = new ArrayList<>();
    }

    public void addAtt(SizedBoxAtt att){
        atts.add(att);
    }

    @Override
    public String toString() {
        String top ="";
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
        StringBuilder str = new StringBuilder("sizedBox atts");
        for(SizedBoxAtt att : atts){
            str.append("\n\t\t").append(att.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("SizedBoxAtts", this.hashCode());
        for (int i = 0; i < atts.size(); i++) {
            top = top.concat(atts.get(i).codeGenerationImp());
            top =top.concat("\n");
        }
        return top;
    }

}
