package mood3;


public class Demon extends Character<Integer, Double> {

    public Demon(String username, int level, Double specialPoints) {
        super(username, level, specialPoints);
        this.hashPassword();
    }

    @Override
    public Double getSpecialResult() {
        return super.getSpecialPoints() * super.getLevel();
    }

    @Override
    public void hashPassword() {
        super.setHashedPassword(super.getUsername().length() * 217);
    }

    @Override
    public String toString() {
        return super.toString() + this.getSpecialResult();
    }
}
