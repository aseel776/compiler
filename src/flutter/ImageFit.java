package flutter;

import java.io.Console;

public class ImageFit extends ImageAtt {

    public String imageFit;

    public ImageFit(String imageFit) {
        this.imageFit = imageFit;
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
        String fit;
        System.out.println("imageFit");
        System.out.println(imageFit);
        System.out.println(imageFit);
        if (imageFit == "BoxFit.cover") {
            fit = "cover";
        } else if (imageFit == "BoxFit.fill") {
            fit = "fill";
        } else {
            fit = "contain";
        }

        String top = " style = ' object-fit: " + fit + ";' ";

        return top;
    }

}
