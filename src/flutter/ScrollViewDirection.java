package flutter;

public class ScrollViewDirection extends ScrollViewAtt {

    public String scrollDirection;

    public ScrollViewDirection(String scrollDirection){
        this.scrollDirection=scrollDirection;
    }

    @Override
    public String toString() {
        return "scrollDirection: " + scrollDirection;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("scroll direction");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top ="";
        if(scrollDirection.equalsIgnoreCase("horizontal")){
            top=top.concat("d-flex flex-row");
        }else if (scrollDirection.equalsIgnoreCase("vertical")){
            top=top.concat("d-flex flex-column");
        }

        return top;

    }
}