package test;

public abstract class TestAbstract {

    private String name;

    protected TestAbstract(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

