package flutter;

import nodes.ZeroParameters;

public class Scaffold extends Component{
    public ScaffoldAtts scaffoldAtts ;

    public Scaffold(ScaffoldAtts atts){
        super("Scaffold", atts);
        this.scaffoldAtts = atts;
    }

    public Scaffold(){
        super("Scaffold", new ZeroParameters());
    }

    @Override
    public String toString() {
        if(scaffoldAtts != null){
            return "new Scaffold (\n" + scaffoldAtts.toString() + "\n)";
        }else{
            return "new Scaffold()";
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("scaffold");
        if(scaffoldAtts != null){
            str.append("\n\t\t").append(scaffoldAtts.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("Scaffold", this.hashCode()) ;
        if (scaffoldAtts != null) {
            top =top.concat(scaffoldAtts.codeGenerationImp());
            top =top.concat("\n");
        }
        return top;
    }
}

