package flutter;

import nodes.DartList;

public  class Column_row_Children extends Column_rowAtt{

    public DartList list ;
    public Column_row_Children(DartList list){
        this.list=list;
    }

    @Override
    public String toString() {
        return "children:"+ list.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("children");
        str.append("\n\t\t").append(list.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top= Utils.setCommentWidgetName("Column_row_Children", this.hashCode());
        top =top.concat(list.codeGenerationImp());
        return top;
    }
}

