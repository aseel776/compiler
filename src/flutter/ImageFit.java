package flutter;

public class ImageFit extends ImageAtt{

    public String imageFit ;

    public ImageFit(String imageFit ){
        this.imageFit= imageFit;
    }

    @Override
    public String toString() {
        return "fit: " + imageFit;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("image fit");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        // TODO add fit for image
        String style = "";
        return style;
    }
}
