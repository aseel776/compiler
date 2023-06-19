package nodes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Start {

    public List<Node> nodes;

    public Start() {
        nodes = new ArrayList<>();
    }

    public void addNode(Node n) {
        nodes.add(n);
    }

    @Override
    public String toString() {
        String program = "";
        for (Node n : nodes) {
            program = program.concat(n.toString() + '\n');
        }
        return program;
    }

    public StringBuilder astImp() {
        StringBuilder start = new StringBuilder("start");
        for (Node n : nodes) {
            start.append("\n\t\t").append(n.astImp());
        }
        return start;
    }

    public void generateCode() {

        clearFiles();

        try {

            for (Node node : nodes) {

                File file;
                File jsFile;
                FileWriter fileWriter;
                FileWriter jsFileWriter;

                if (node instanceof DartClass dClass) {
                    file = new File("code_generation/classes", dClass.id + ".php");
                } else if (node instanceof Function function) {
                    file = new File("code_generation/functions", function.signature.id + ".php");
                } else {
                    file = new File("code_generation/crash.php");
                }

                if (file.createNewFile()) {
                    fileWriter = new FileWriter(file);
                    fileWriter.write(node.codeGenerationImp());
                    fileWriter.close();
                }

                if(node instanceof Function function){
                    jsFile = new File("code_generation/functions", function.signature.id + ".js");
                    if(jsFile.createNewFile()){
                        jsFileWriter = new FileWriter(jsFile);
                        jsFileWriter.write(node.toJs());
                        jsFileWriter.close();
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearFiles(){
        String dirPath = "code_generation/classes";
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        for(File file: files){
            file.delete();
        }
        dirPath = "code_generation/functions";
        dir = new File(dirPath);
        files = dir.listFiles();
        for(File file: files){
            file.delete();
        }
    }
}
