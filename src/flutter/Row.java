package flutter;

import nodes.ZeroParameters;

public class Row extends Component{

    public Column_rowAtts rowAtts;

    public Row(Column_rowAtts atts){
        super("Row",atts);
        this.rowAtts=atts;
    }

    public Row(){
        super("Row", new ZeroParameters());
    }

    @Override
    public String toString() {
        if(rowAtts != null){
            return "new Row (\n" + rowAtts.toString()+"\n);";
        }else {
            return "new Row ()";
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("row");
        if(rowAtts != null){
            str.append("\n\t\t").append(rowAtts.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String classes []= {"d-flex", "flex-column"};

        String top= Utils.setCommentWidgetName("Row", this.hashCode());

        top =top.concat( "<div"+ Utils.setClassesNames(classes) +">" );
        top =top.concat("\n");
        top =top.concat( rowAtts.codeGenerationImp());
        top =top.concat("\n");
        top =top.concat("</div>");
        return top;
    }
}
