package nodes;

public abstract class ClassMethod extends Node{
    public Signature signature;

    public ClassMethod(Signature signature){
        this.signature = signature;
    }
}
