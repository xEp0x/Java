package kingsGambit;


public abstract class BaseUnit {

    private String name;

    protected BaseUnit(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }
}
