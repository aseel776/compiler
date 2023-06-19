package nodes;

import org.antlr.v4.runtime.misc.Pair;
import symbolTable.SymbolTableTraveller;
import utils.Type;
import visitors.AntlrToNode;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;

public class DartClass extends Node {

    public Boolean isAbstract;
    public String id;
    public String superClass;
    public String impInterface;
    public ClassBody classBody;

    public DartClass(Boolean isAbstract, String id, String superClass, String impInterface, ClassBody classBody) {
        this.isAbstract = isAbstract;
        this.id = id;
        if (superClass != null) {
            this.superClass = superClass;
        }
        if (impInterface != null) {
            this.impInterface = impInterface;
        }
        this.classBody = classBody;

    }

    public void check(int line) {
        Type type = Type.Class;
        if (superClass != null) {
            // checking if the super class is defined
            SymbolTableInstance superClassElement = new SymbolTableInstance(superClass, 0, "Class", 0, type);
            Pair<Boolean, Integer> superClassExist = SymbolTableTraveller.checkIfDefined(superClassElement);
            if (!superClassExist.a) {
                AntlrToNode.semanticErrors.add("Error: class " + superClass + " at line " + line + " is not defined");
            }
        }
        // checking if the class is defined
        SymbolTableInstance currentElement = new SymbolTableInstance(id, 0, "Class", line, type);
        Pair<Boolean, Integer> errorCheck = SymbolTableTraveller.checkIfDefined(currentElement);
        if (errorCheck.a) {
            AntlrToNode.semanticErrors
                    .add("Error: class " + id + " at line " + line + " is already defined at line" + errorCheck.b);
        } else {
            SymbolTable.addNode(currentElement);
        }
    }

    @Override
    public String toString() {
        String wholeClass;
        if (isAbstract) {
            wholeClass = "abstract class" + " " + id + " ";
        } else {
            wholeClass = "class" + " " + id + " ";
        }
        if (superClass != null) {
            wholeClass = wholeClass.concat("extends" + " " + superClass + " ");
        }
        if (impInterface != null) {
            wholeClass = wholeClass.concat("implements" + " " + impInterface + " ");
        }
        wholeClass = wholeClass.concat(classBody.toString());
        return wholeClass;
    }

    @Override
    public StringBuilder astImp() {

        StringBuilder str = new StringBuilder("class");
        if (isAbstract) {
            str.append("\n\t\tabstract");
        }
        str.append("\n\t\tclass ").append(id);
        if (superClass != null) {
            str.append("\n\t\textends ").append(superClass);
        }
        if (impInterface != null) {
            str.append("\n\t\timplements ").append(impInterface);
        }
        str.append("\n\t\t").append(classBody.astImp());
        return str;

    }

    @Override
    public String codeGenerationImp() {
        if (superClass != null) {
            if (superClass.equalsIgnoreCase("StatelessWidget") || superClass.equalsIgnoreCase("StatefulWidget")) {
                ClassMethod build = null;
                for (ClassMethod method : classBody.methods) {
                    if (method.signature.id.equalsIgnoreCase("build")) {
                        build = method;
                    }
                }
                assert build != null;
                return build.codeGenerationImp();
            } else {
                String str = "";
                if (isAbstract) {
                    str = "abstract class" + " " + id + " ";
                } else {
                    str = "class" + " " + id + " ";
                }
                str = str.concat("extends" + " " + superClass + " ");
                if (impInterface != null) {
                    str = str.concat("implements" + " " + impInterface + " ");
                }
                str = str.concat(classBody.codeGenerationImp());
                return str;
            }
        }
        else{
            String str = "";
            if (isAbstract) {
                str = "abstract class" + " " + id + " ";
            } else {
                str = "class" + " " + id + " ";
            }
            if (impInterface != null) {
                str = str.concat("implements" + " " + impInterface + " ");
            }
            str = str.concat(classBody.codeGenerationImp());
            return str;
        }
    }

    // @Override
    // public String codeGenerationImp() {
    //     String str = """
    //             <!DOCTYPE html>
    //             <html lang="en">
    //             <head>
    //             <meta charset="UTF-8">
    //             <meta name="viewport" content="width=device-width, initial-scale=1.0">
    //             <title>""";
    //     str = str.concat(id);
    //     str = str.concat("""
    //             </title>
    //             </head>
    //             <body>""");
    //     str = str.concat('\n' + classBody.codeGenerationImp());
    //     str = str.concat("""
    //             \n</body>
    //             </html>
    //             """);

    //     return str;
    // }

}
