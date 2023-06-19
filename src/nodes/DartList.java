package nodes;

import java.util.ArrayList;
import java.util.List;

public class DartList extends Node{
    public List<Node> elements;

    public DartList(List<Node> elements){
        this.elements = elements;
    }

    public DartList(){
        elements = new ArrayList<>();
    }

    public void addElement(Node element){
        elements.add(element);
    }

    @Override
    public String toString() {
        String list = "[";
        for(int i = 0; i < elements.size(); i++){
            if(i == elements.size() - 1){
                list = list.concat(elements.get(i).toString());
            }else {
                list = list.concat(elements.get(i).toString() + ',');
            }
        }
        list = list.concat("]");
        return list;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("list");
        for (Node n: elements) {
            str.append("\n\t\t").append(n.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "array(" ;
        for(int i = 0; i < elements.size(); i++){
            if(i == elements.size() - 1){
                str = str.concat(elements.get(i).codeGenerationImp());
            }else {
                str = str.concat(elements.get(i).codeGenerationImp() + ',');
            }
        }
        str = str.concat(")");
        return str;

    }
}
