package flutter;

import nodes.Parameters;
import java.util.ArrayList;
import java.util.List;

public  class TextAtts extends Parameters {

    public List<TextAtt> textAtt;

    public  TextAtts(List<TextAtt>textAtt){
        this.textAtt=textAtt;
    }

    public  TextAtts(){
        this.textAtt= new ArrayList<>();
    }
    public void addAtt(TextAtt textAtt){
        this.textAtt.add(textAtt);
    }

    @Override
    public String toString() {
        String top="" ;
        for (int i = 0; i < textAtt.size(); i++) {
            if (i == textAtt.size() - 1) {
                top = top.concat(textAtt.get(i).toString() + "\n");
            } else {
                top = top.concat(textAtt.get(i).toString() + "," + "\n");
            }
        }
        return top ;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("text atts");
        for (TextAtt att: textAtt){
            str.append("\n\t\t").append(att.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("TextAtts", this.hashCode());
        for (int i = 0; i < textAtt.size(); i++) {
            top = top.concat(textAtt.get(i).codeGenerationImp());
            top =top.concat("\n");
        }
        return top;
    }
}
