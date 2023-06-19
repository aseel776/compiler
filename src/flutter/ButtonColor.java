package flutter;

public class ButtonColor extends ButtonAtt{

    public String color;

    public ButtonColor(String color){
        this.color= color;
    }

    @Override
    public String toString() {

        return "buttonColor: " + color;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("button color");
        str.append("\n\t\t").append(this);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String top = Utils.setCommentWidgetName("ButtonColor", this.hashCode());
        top = Utils.addClassToParentElementByScript(top, "bg-" + Utils.getBootstrapColor(color));
        return top;
    }
}
