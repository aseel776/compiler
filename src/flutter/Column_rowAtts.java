package flutter;

import nodes.Parameters;
import java.util.ArrayList;
import java.util.List;

public  class Column_rowAtts extends Parameters {
    public List<Column_rowAtt>column_rowAtt;
    public  Column_rowAtts(List<Column_rowAtt>column_rowAtt){
        this.column_rowAtt=column_rowAtt;
    }

    public  Column_rowAtts(){
        this.column_rowAtt= new ArrayList<>();
    }
    public void addAtt(Column_rowAtt column_rowAtt){
        this.column_rowAtt.add(column_rowAtt);
    }

    @Override
    public String toString() {
        String top="" ;
        for (int i = 0; i < column_rowAtt.size(); i++) {
            if (i == column_rowAtt.size() - 1) {
                top = top.concat(column_rowAtt.get(i).toString() + "\n");
            } else {
                top = top.concat(column_rowAtt.get(i).toString() + "," + "\n");
            }
        }
        return top ;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("column_rowAtts");
        for (Column_rowAtt att: column_rowAtt) {
            str.append("\n\t\t").append(att.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {

        String top= Utils.setCommentWidgetName("Column_rowAtts", this.hashCode());

        for (int i = 0; i < column_rowAtt.size(); i++) {
            top = top.concat(column_rowAtt.get(i).codeGenerationImp() );
            top =top.concat("\n");
        }
        return top ;
    }
}
