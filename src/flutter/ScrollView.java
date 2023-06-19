package flutter;

import nodes.ZeroParameters;

public class ScrollView extends Component{

    public ScrollViewAtts scrollViewAtts ;

    public ScrollView(ScrollViewAtts scrollViewAtts){
        super("ScrollView", scrollViewAtts);
        this.scrollViewAtts= scrollViewAtts;
    }

    public ScrollView(){
        super("ScrollView", new ZeroParameters());
    }

    @Override
    public String toString() {
        if(scrollViewAtts != null){
            return "new ScrollView (\n" + scrollViewAtts.toString() + ")";
        }else{
            return "new ScrollView ()";
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("scroll view");
        if(scrollViewAtts != null){
            str.append("\n\t\t").append(scrollViewAtts.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("ScrollView", this.hashCode());
        top=top.concat("<div class = 'overflow-scroll ' > \n");
        top=top.concat(scrollViewAtts.codeGenerationImp()+"\n");
        top=top.concat("</div> \n");

        return  top;
    }
}
