package nodes;

public class ListItem extends Node{

    public String listId;
    public int index;

    public ListItem(String listId, int index){
        this.listId = listId;
        this.index = index;
    }

    @Override
    public String toString() {
        return listId + '[' + index + ']';
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("list item").append("\n\t\t").append(this);
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "$" + listId + "[" + index + "]";
        return str;
    }
}
