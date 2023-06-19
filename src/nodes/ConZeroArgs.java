package nodes;

public class ConZeroArgs extends ConsArgs{

    @Override
    public String toString() {
        return "()";
    }

    @Override
    public StringBuilder astImp() {
        return new StringBuilder("constructor zero arguments");
    }

    @Override
    public String codeGenerationImp() {
        String str = "()";
        return str;
    }
}
