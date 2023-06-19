package visitors;

import nodes.Start;
import antlr.*;

import java.util.ArrayList;
import java.util.List;

public class AntlrToStart extends DartGrammarsBaseVisitor<Start> {
    public List<String> semanticErrors;

    @Override
    public Start visitStart(DartGrammarsParser.StartContext ctx) {
        Start start = new Start();
        semanticErrors = new ArrayList<>();
        AntlrToNode nodesVisitor = new AntlrToNode(semanticErrors);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (i == ctx.getChildCount() - 1) {
                continue;
            } else {
                start.addNode(nodesVisitor.visit(ctx.getChild(i)));
            }
        }

        return start;
    }

}
