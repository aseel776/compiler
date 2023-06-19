package nodes;

import java.util.List;

public class ClassBody extends Node{


    public List<ClassAttribute> attributes;
    public List<ClassMethod> methods;
    public DefaultConstructor defaultConstructor;

    public ClassBody(List<ClassAttribute> attributes, List<ClassMethod> methods, DefaultConstructor defaultConstructor){
        this.attributes = attributes;
        this.methods = methods;
        if(defaultConstructor != null){
            this.defaultConstructor = defaultConstructor;
        }
    }

    @Override
    public String toString() {
        String body = "{ \n";
        for (ClassAttribute att: attributes) {
            body = body.concat(att.toString()) + "; \n";
        }
        if(defaultConstructor != null){
            body = body.concat(defaultConstructor.toString() + '\n');
        }
        for (ClassMethod method: methods) {
            body = body.concat(method.toString() + '\n');
        }
        body = body.concat("}");
        return body;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("class body");
        for (ClassAttribute att: attributes) {
            str.append("\n\t\t").append(att.astImp());
        }
        for (ClassMethod m: methods) {
            str.append("\n\t\t").append(m.astImp());
        }
        if(defaultConstructor != null){
            str.append("\n\t\t").append(defaultConstructor.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "{\n";
        for (ClassAttribute att: attributes) {
            str = str.concat(att.codeGenerationImp()) + "\n";
        }
        if(defaultConstructor != null){
            str = str.concat(defaultConstructor.codeGenerationImp() + '\n');
        }
        for (ClassMethod method: methods) {
            str = str.concat(method.codeGenerationImp() + '\n');
        }
        str = str.concat("}");
        return str;
    }
}
