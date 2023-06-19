package flutter;

import nodes.Parameters;
import java.util.ArrayList;
import java.util.List;

public  class StackAtts extends Parameters {

    public List<StackAtt> stackAtt;

    public  StackAtts(List<StackAtt>stackAtt){
        this.stackAtt=stackAtt;
    }

    public  StackAtts(){
        this.stackAtt= new ArrayList<>();
    }

    public  void addAtt(StackAtt stackAtt){
        this.stackAtt.add(stackAtt);
    }

    @Override
    public String toString() {
        String top="" ;
        for (int i = 0; i < stackAtt.size(); i++) {
            if (i == stackAtt.size() - 1) {
                top = top.concat(stackAtt.get(i).toString() + "\n");
            } else {
                top = top.concat(stackAtt.get(i).toString() + "," + "\n");
            }
        }
        return top ;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("stack atts");
        for(StackAtt s: stackAtt){
            str.append("\n\t\t").append(s.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("StackAtts", this.hashCode());
        for (int i = 0; i < stackAtt.size(); i++) {
            top = top.concat(stackAtt.get(i).codeGenerationImp());
            top = top.concat("\n");
        }
        return top;
    }
}
