package kingsGambitExtended.models;

import kingsGambitExtended.abstractions.Defender;


public class KillDefenderEvent {

    private Defender defender;
    private King king;

    public KillDefenderEvent(Defender defender, King king) {
        this.defender = defender;
        this.king = king;
    }

    public void execute() {
        this.defender.setHp(this.defender.getHp() - 1);
        if (this.defender.getHp() <= 0) {
            this.king.killDefender(defender.getDefenderName());
        }
    }
}
