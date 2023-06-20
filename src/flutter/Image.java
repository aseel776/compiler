package flutter;

import nodes.ZeroParameters;

public class Image extends Component {

    public ImageAtts imageAtts;
    public String src;

    public Image(String src, ImageAtts imageAtts) {
        super("Image", imageAtts);
        this.src = src;
        this.imageAtts = imageAtts;
    }

    public Image(String src) {
        super("Image", new ZeroParameters());
        this.src = src;
    }

    @Override
    public String toString() {
        if (imageAtts != null) {
            return "new Image (\n" + src + '\n' + imageAtts.toString() + "\n)";
        } else {
            return "new Image (\n" + src + "\n)";
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("image");
        str.append("\n\t\t").append(src);
        if (imageAtts != null) {
            str.append("\n\t\t").append(imageAtts.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("Image", this.hashCode());
        String atts;
        if (imageAtts != null) {
            System.out.println(1);
            atts = imageAtts.codeGenerationImp();
            top = top.concat("\n<img src=" + src + " "  + atts + " >");
        }else{
            top = top.concat("\n<img  src=" + src + ">");
        }
        return top;
    }
}