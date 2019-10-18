package borderControl;


public class Citizen implements Identifiable {

    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean isFake(String id) {
        return this.id.endsWith(id);
    }

    @Override
    public String getId() {
        return id;
    }
}
