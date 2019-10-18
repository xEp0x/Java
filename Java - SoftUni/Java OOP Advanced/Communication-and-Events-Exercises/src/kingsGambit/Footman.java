package kingsGambit;


public class Footman extends BaseUnit implements Defender {

    public Footman(String name) {
        super(name);
    }

    @Override
    public void respond() {
        System.out.println(String.format("Footman %s is panicking!", super.getName()));
    }

    @Override
    public String getDefenderName() {
        return super.getName();
    }
}
