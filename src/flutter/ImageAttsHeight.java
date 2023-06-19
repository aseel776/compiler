package flutter;

import nodes.DartInteger;

public class ImageAttsHeight extends ImageAtt{
    DartInteger number ;
    public ImageAttsHeight(DartInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "imageHeight: " + number.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("image height");
        str.append("\n\t\t").append(this);
        return str;
    }
    @Override
    public String codeGenerationImp() {
        return "height='"+number+ "'";
    }

}
