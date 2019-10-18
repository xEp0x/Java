package factories;

import interfaces.Behavior;

public class BehaviorFactory {
    private static final String BEHAVIORS_PACKAGE = "models.behaviors.";
    private static final String BEHAVIOR_SUFFIX = "Behavior";

    public Behavior createBehavior(String behaviorType) throws ReflectiveOperationException {
        Class<Behavior> behaviorClass = (Class<Behavior>) Class.forName(BEHAVIORS_PACKAGE + behaviorType + BEHAVIOR_SUFFIX);
        return behaviorClass.newInstance();
    }
}
