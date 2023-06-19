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
        if(scrollDirection=="horizontal"){
            top=top.concat("d-flex flex-column");
        }else if (scrollDirection=="vertical"){
            top=top.concat("d-flex flex-column");
        }

        return top;

    }
}