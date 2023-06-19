package nodes;

public class ForeachStatement extends Statement{

    public String type;
    public String  id;
    public Variable list;
    public Block block ;

    public ForeachStatement(String type, String id, Variable list, Block block){
        this.type = type;
        this.id = id;
        this.list = list;
        this.block = block;
    }

    @Override
    public String toString() {
        return "foreach" + '(' + type + " " + id + " in " + list.toString() + ')'
                + '\n' + block.toString();
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("foreach");
        str.append("\n\t\t").append(type).append(" ").append(id).append(" in ").append(list.astImp());
        str.append("\n\t\t").append(block.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str = "";
        str = "foreach" + '('  + list.codeGenerationImp() + " as " +"$" + id + ')' + '\n' + block.codeGenerationImp();
        return str;
    }
}
