package flutter;

public class NavigationPushing extends Navigation{

    public Page page;

    public NavigationPushing(Page page){
        this.page = page;
    }

    @Override
    public String toString() {
        return "Navigator.push(" + page.toString() + ")";
    }

    @Override
    public StringBuilder astImp() {
        StringBuilder str = new StringBuilder("push");
        str.append("\n\t\t").append(page.astImp());
        return str;
    }

    @Override
    public String codeGenerationImp() {
        return null;
    }
}
