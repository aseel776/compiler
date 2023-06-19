package nodes;

public class ClassAttribute extends Node {
    public Boolean isStatic;
    public Declaration declaration;

    public ClassAttribute(Boolean isStatic, Declaration declaration){
        this.isStatic = isStatic;
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        if(isStatic){
            return "static" + " " + declaration.toString();
        }else {
            return declaration.toString();
        }
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("class attribute");
        if(isStatic){
            str.append("\n\t\tstatic ");
        }
        str.append("\n\t\t").append(declaration.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str;
        if(isStatic){
            str = "static" + " " + declaration.codeGenerationImp();
        }else {
            str = declaration.codeGenerationImp();
        }
        return str;
    }
}
