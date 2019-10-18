package factories;

import interfaces.Attack;

public class AttackFactory {
    private static final String ATTACKS_PACKAGE = "models.attacks.";
    private static final String ATTACK_SUFFIX = "Attack";

    public Attack createAttack(String attackType) throws ReflectiveOperationException {
        Class<Attack> attackClass = (Class<Attack>) Class.forName(ATTACKS_PACKAGE + attackType + ATTACK_SUFFIX);
        return attackClass.newInstance();
    }
}
