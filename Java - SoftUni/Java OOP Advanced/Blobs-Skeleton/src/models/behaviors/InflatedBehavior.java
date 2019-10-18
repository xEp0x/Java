package models.behaviors;

import models.Blob;

public class InflatedBehavior extends AbstractBehavior {

    private static final int INFLATED_HEALTH_GAIN = 50;
    private static final int INFLATED_HEALTH_DECREMENT = 10;

    public InflatedBehavior() {
    }

    @Override
    public void trigger(Blob source) {
        if (!super.isTriggered()) {
            super.setIsTriggered(true);
            this.applyTriggerEffect(source);
        }
    }

    @Override
    public void applyRecurrentEffect(Blob source) {
        if (super.toDelayRecurrentEffect()) {
            super.setToDelayRecurrentEffect(false);
        } else {
            source.setHealth(source.getHealth() - INFLATED_HEALTH_DECREMENT);
        }
    }

    private void applyTriggerEffect(Blob source) {
        source.setHealth(source.getHealth() + INFLATED_HEALTH_GAIN);
    }
}
