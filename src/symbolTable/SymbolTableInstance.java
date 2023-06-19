package symbolTable;

import utils.Type;

public class SymbolTableInstance {
    public String id;
    public int parentHash;
    public int objectHash;
    public String category;
    public int declarationLineNumber;

    public Type type;

    public SymbolTableInstance(String id,
                               Integer parentHash,
                               String category,
                               Integer declarationLineNumber,
                               Type type) {
        this.id = id;
        this.parentHash = parentHash;
        this.category = category;
        this.declarationLineNumber = declarationLineNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return id + ":\n" + category + " at line " + declarationLineNumber;
    }
}
