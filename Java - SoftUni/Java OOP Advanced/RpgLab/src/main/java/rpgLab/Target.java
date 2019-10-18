package rpgLab;


public interface Target {
    int getHealth();

    void takeAttack(int attackPoints);

    int giveExperience();

    Weapon dropLoot(RandomProvider random);

    boolean isDead();
}
