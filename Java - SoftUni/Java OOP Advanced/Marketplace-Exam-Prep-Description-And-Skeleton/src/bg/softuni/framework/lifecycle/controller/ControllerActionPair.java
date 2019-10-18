package bg.softuni.framework.lifecycle.controller;

import java.lang.reflect.Method;
import java.util.Map;

public final class ControllerActionPair {
    private final Method action;


    private final Object controller;

    private Map<Integer, Class> argumentsMapping;

    public ControllerActionPair(final Object controller, final Method action, final Map<Integer, Class> argumentsMapping) {
        this.controller = controller;
        this.action = action;
        this.argumentsMapping = argumentsMapping;
    }

    public Method getAction() {
        return action;
    }

    public Object getController() {
        return controller;
    }

    public Map<Integer, Class> getArgumentsMapping() {
        return this.argumentsMapping;
    }
}
