package flutter;

import nodes.DartObject;
import nodes.Parameters;

public abstract class Component extends DartObject {
    public Component(String id, Parameters parameters){
        super(id, parameters);
    }
}
