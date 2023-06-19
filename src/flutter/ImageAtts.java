package flutter;

import nodes.Parameters;
import java.util.ArrayList;
import java.util.List;

public class ImageAtts extends Parameters {
    public List<ImageAtt> atts;

    public ImageAtts(List<ImageAtt> atts){
        this.atts = atts;
    }

    public ImageAtts(){
        atts = new ArrayList<>();
    }

    public void addAtt(ImageAtt att){
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
        StringBuilder str = new StringBuilder("image atts");
        for (ImageAtt att: atts) {
            str.append("\n\t\t").append(att.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("Image", this.hashCode());
        for (int i = 0; i < atts.size(); i++) {
            top = top.concat(atts.get(i).toString());
        }
        return top;
    }

}
