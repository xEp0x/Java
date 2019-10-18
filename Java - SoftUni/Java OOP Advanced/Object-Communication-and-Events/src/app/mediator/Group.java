package app.mediator;

import app.models.Attacker;
import app.models.Target;
import app.observer.ObservableTarget;

import java.util.ArrayList;
import java.util.List;


public class Group implements AttackGroup {

    private List<Attacker> attackers;

    public Group() {
        this.attackers = new ArrayList<>();
    }

    @Override
    public void addMember(Attacker attacker) {
        this.attackers.add(attacker);
    }

    @Override
    public void groupTarget(ObservableTarget target) {
        for (Attacker attacker : attackers) {
            attacker.setTarget(target);
        }
    }

    @Override
    public void groupAttack() {
        this.attackers.forEach(Attacker::attack);
    }
}
