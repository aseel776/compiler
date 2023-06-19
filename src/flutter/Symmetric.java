package flutter;

import java.util.List;

public  class Symmetric extends PaddingValues {

    public List <HorizontalOrVertical> horizontalOrVertical;

    public Symmetric(List<HorizontalOrVertical> horizontalOrVertical) {
        this.horizontalOrVertical = horizontalOrVertical;
    }

    @Override
    public String toString() {
        String top= new String( "values: PaddingValues.symmetric(\n" )  ;
        for (int i = 0; i < horizontalOrVertical.size(); i++) {
            if (i == horizontalOrVertical.size() - 1) {
                top = top.concat(horizontalOrVertical.get(i).toString() + "\n");
            } else {
                top = top.concat(horizontalOrVertical.get(i).toString() + "," + "\n");
            }
        }
        top = top.concat(")");
        return top ;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("values");
        str.append("\n\t\tsymmetric");
        for (HorizontalOrVertical horv: horizontalOrVertical){
            str.append("\n\t\t").append(horv.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("Symmetric", this.hashCode());

        for (int i = 0; i < horizontalOrVertical.size(); i++) {
            top = top.concat(horizontalOrVertical.get(i).codeGenerationImp());
            top =top.concat("\n");
        }
        return top;

    }
}
