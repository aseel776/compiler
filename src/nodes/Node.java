package nodes;

public abstract class Node {
    public int objectHash = 0;
    
    abstract public StringBuilder astImp();

    abstract public String codeGenerationImp();
    
    public String toJs() {
        return "";
    }
}
