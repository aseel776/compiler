package flutter;

import nodes.DartMap;
import nodes.Node;

public class Page extends Node {

    public Route route;
    public DartMap map;

    public Page(Route route, DartMap map) {
        this.route = route;
        this.map = map;
    }

    public Page(Route route) {
        this.route = route;
        map = null;
    }

    @Override
    public String toString() {
        String str = route.toString();
        if (map != null) {
            str = str.concat(", args: " + map.toString());
        }
        return str;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("page");
        str.append("\n\t\t").append(route.astImp());
        if (map != null) {
            str.append("\n\t\t").append(map.astImp());

        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        // TODO Auto-generated method stub
        String top = "<form method=>";
        int hash = this.hashCode();
        if (map != null) {
            top = top.concat("<form id='" + hash + "' method='GET' action='" + route.codeGenerationImp() + "' > \n");
            top = top.concat("</form>");
            top = top.concat("<script> var form= document.getElementById('" + hash + "');  form.submit();  </script>");
        }

        else {
            top = top.concat("<form id='" + hash + "' method='POST' action='" + route.codeGenerationImp() + "' > \n");
            for (int i = 0; i < map.elements.size(); i++) {
                top = top.concat("<input name='" + map.elements.get(i).a + "'  value='" + map.elements.get(i).b + "'>");
            }
            top = top.concat("</form>");
            top = top.concat("<script> var form= document.getElementById('" + hash + "');  form.submit();  </script>");
        }
        return top; 

    }
}
