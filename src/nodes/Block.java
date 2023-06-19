package nodes;

import java.util.List;
import java.util.ArrayList;

public class Block extends Node{

    public List<Statement> statements;

    public Block(){
        statements = new ArrayList<>();
    }

    public void addStatement(Statement s){
        statements.add(s);
    }

    @Override
    public String toString() {
        String block = new String("{");
        for (Node n : statements) {
            block = block.concat('\n' + n.toString());
        }
        block = block.concat("\n }");
        return block;
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("block");
        for (Node n : statements){
            str.append("\n\t\t").append(n.astImp());
        }
        return str;
    }

    @Override
    public String codeGenerationImp() {
        String str= "{\n";
        for (Node n : statements){
            str = str.concat(n.codeGenerationImp());
        }
        str =str.concat("\n}");
        return str;
    }
}