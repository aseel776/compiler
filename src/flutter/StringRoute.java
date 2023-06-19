package flutter;

public class StringRoute extends Route{

    public String routeName;

    public StringRoute(String name){
        routeName =  name;
    }

    @Override
    public String toString() {
        return routeName;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("route");
        str.append("\n\t\t").append(routeName);
        return str;
    }

    @Override
    public String codeGenerationImp() {
        return "code_generation/classes/"+ routeName+".php";

    }
}
