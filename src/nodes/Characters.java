package nodes;

public class Characters extends Node{

    public String text;

    public Characters(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("characters").append(text);
    }

    @Override
    public String codeGenerationImp() {
        return "\"" + text + "\"";
    }
}
