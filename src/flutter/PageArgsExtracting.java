package flutter;

import nodes.Node;
import nodes.Statement;

public class PageArgsExtracting extends Statement {

    public String type;
    public String id;
    public Node value;

    public PageArgsExtracting(String type, String id){
        this.type = type;
        this.id = id;
        this.value = null;
    }

    public PageArgsExtracting(String type, String id, Node value){
        this.type = type;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return type + " " + id + " = Route.args";
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("data extracting");
    }

    @Override
    public String codeGenerationImp() {
    return this.toJs(); 
    }

    @Override
    public String toJs() {
        String temp;
        temp = """
            </script> 
            <?php $map = $_POST ;
            foreach ($map as $a){
                echo $a;
                    echo '<br>';
            }
            
            ?>
            <script> 
                """;
        return temp ; 
    }
}
