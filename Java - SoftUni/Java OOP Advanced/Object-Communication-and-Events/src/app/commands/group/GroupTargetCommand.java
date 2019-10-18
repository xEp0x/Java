package app.commands.group;

import app.commands.Command;
import app.mediator.AttackGroup;
import app.models.Target;
import app.observer.ObservableTarget;


public class GroupTargetCommand implements Command {

    private AttackGroup group;
    private ObservableTarget target;

    public GroupTargetCommand(AttackGroup group, ObservableTarget target) {
        this.group = group;
        this.target = target;
    }

    @Override
    public void execute() {
        this.group.groupTarget(target);
    }
}
