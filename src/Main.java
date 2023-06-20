import nodes.*;

import java.io.IOException;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;
import utils.Type;
import visitors.AntlrToStart;
import antlr.DartGrammarsLexer;
import antlr.DartGrammarsParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {
    public static void main(String[] args){
        SymbolTable.table.add(new SymbolTableInstance("StatelessWidget", 0, "Predefined Class", -1, Type.Class));
        SymbolTable.table.add(new SymbolTableInstance("StatefulWidget", 0, "Predefined Class", -1, Type.Class));
        String source = "./tests/tttt.txt";
        CharStream input;
        try {
            input = CharStreams.fromFileName(source);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        DartGrammarsLexer lexer = new DartGrammarsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DartGrammarsParser parser = new DartGrammarsParser(tokens);
        ParseTree ast = parser.start();
        AntlrToStart startVisitor = new AntlrToStart();
        Start program = startVisitor.visit(ast);
        if(startVisitor.semanticErrors.isEmpty()){
           program.generateCode();
        }else{
            for (String err: startVisitor.semanticErrors){
                System.out.println(err);
            }
        }
//        System.out.println("---AST---");
//        System.out.print(program.astImp());
//        System.out.println("---Symbol Table---");
//        SymbolTable.printSymbolTable();
    }
}
