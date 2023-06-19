package symbolTable;

import java.util.*;


public class SymbolTable {

    public static final List<SymbolTableInstance> table = new ArrayList<>();

    public static void addNode(SymbolTableInstance newNode) {
        table.add(newNode);
    }

    public static void replaceVarByAtt(String id, int parentHash) {
        for (SymbolTableInstance s: table) {
            boolean cond1 = (s.id.compareTo(id) == 0);
            boolean cond2 = (s.parentHash == parentHash);
            if(cond1 && cond2){
                s.category = "Class Att";
                break;
            }
        }
    }

    public static void printSymbolTable(){
        table.sort(Comparator.comparing(o -> o.declarationLineNumber));
        for (SymbolTableInstance s: table) {
            System.out.println(s.toString());
            System.out.println("type: " + s.type);
            System.out.println("-----");
        }
    }

}