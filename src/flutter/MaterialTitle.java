package flutter;

public class MaterialTitle extends MaterialAppAtt{

    public String title;

    public MaterialTitle(String character){
        super();
        this.title= character;

    }

    @Override
    public String toString() {
        return "title:"+title;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("material title");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("MaterialTitle", this.hashCode());
        top = top.concat("<script> \n");
        top = top.concat("document.title="+title +"\n");
        top = top.concat("</script> \n");
        return top;
    }
}

