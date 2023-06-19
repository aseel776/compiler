package symbolTable;

import nodes.Node;
import org.antlr.v4.runtime.misc.Pair;

public class SymbolTableTraveller {
    public static Node currentNode;
    public static Node parentNode;

    public static Pair<Boolean, Integer> checkIfDefined(SymbolTableInstance currentNode) {
        int variableDeclarationLine = 0;
        for (SymbolTableInstance Node : SymbolTable.table) {
            if (currentNode.id.equals(Node.id)) {
                if (currentNode.parentHash == Node.parentHash) {
                    variableDeclarationLine = Node.declarationLineNumber;
                    return new Pair<>(true, variableDeclarationLine);
                }
            }
        }
        return new Pair<>(false, variableDeclarationLine);
    }
}
