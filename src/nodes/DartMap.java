package nodes;

import java.util.List;
import java.util.ArrayList;
import org.antlr.v4.runtime.misc.Pair;

public class DartMap extends Node{

    public List<Pair<String, Node>> elements;

    public DartMap(List<Pair<String, Node>> elements){
        this.elements = elements;
    }

    public DartMap(){
        elements = new ArrayList<>();
    }

    public void addElement(Pair<String, Node> element){
        elements.add(element);
    }

    @Override
    public String toString() {
        String map = "{\n";
        for(int i = 0; i < elements.size(); i++){
            String item = elements.get(i).a + ": ";
            item = item.concat(elements.get(i).b.toString());
            if(i == elements.size() - 1){
                map = map.concat(item + "\n");
            }else {
                map = map.concat(item + ",\n");
            }
        }
        map = map.concat("}");
        return map;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("map");
        for (Pair<String, Node> e: elements) {
            str.append("\n\t\t").append(e.a).append(':').append(e.b.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "array(\n";
        for(int i = 0; i < elements.size(); i++){
            String item = '\"' + elements.get(i).a + "\" => ";
            item = item.concat(elements.get(i).b.codeGenerationImp());
            if(i == elements.size() - 1){
                str = str.concat(item + "\n");
            }else {
                str = str.concat(item + ",\n");
            }
        }
        str = str.concat(")");
        return str;

    }
}
