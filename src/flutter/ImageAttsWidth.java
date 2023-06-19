package flutter;

import nodes.DartInteger;

public class ImageAttsWidth extends ImageAtt{

    DartInteger number ;

    public ImageAttsWidth(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "imageWidth: " + number.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("image width");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        return "width='" + number + "'";
    }
}
