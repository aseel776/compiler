package flutter;

import nodes.DartObject;

public class ObjectRoute extends Route{

    public DartObject route;

    public ObjectRoute(DartObject route){
        this.route = route;
    }

    @Override
    public String toString() {
        return route.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("route");
        str.append("\n\t\t").append(route.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        return "code_generation/classes/"+ route.id+".php";
    }
}
