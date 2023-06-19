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

        top =top.concat("<h1>" + title + "</h1>");
        top =top.concat("\n");
        return top;
    }
}

