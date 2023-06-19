package flutter;

import nodes.ZeroParameters;

public class Container extends Component{
   ContainerAtts containerAtts;

   public Container(ContainerAtts containerAtts){
       super("Container",containerAtts);
       this.containerAtts=containerAtts;
   }

   public Container(){
       super("Container", new ZeroParameters());
   }

    @Override
    public String toString() {
        if(containerAtts != null){
            return "new Container (\n" + containerAtts.toString()+"\n);";
        }else {
            return "new Container ()";
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("container");
        if(containerAtts != null){
            str.append("\n\t\t").append(containerAtts.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {

        String top = Utils.setCommentWidgetName("Container", this.hashCode());
        top =top.concat("<div>");
        top =top.concat("\n");
        top =top.concat(containerAtts.codeGenerationImp());
        top =top.concat("\n");
        top =top.concat("</div>");
        return top;

    }
}
