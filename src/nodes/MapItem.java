package nodes;

public class MapItem extends Node{

    public String mapId;
    public String key;

    public MapItem(String mapId, String key){
        this.mapId = mapId;
        this.key = key;
    }

    @Override
    public String toString() {
        return mapId + '[' + key + ']';
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("map item").append("\n\t\t").append(this);
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "$" + mapId + "[" + key + "]";
        return str;
    }
}
