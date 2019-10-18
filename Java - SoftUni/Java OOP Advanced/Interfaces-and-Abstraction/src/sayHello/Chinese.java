package sayHello;


public class Chinese implements Person {

    private String name;

    public Chinese(String name) {
        this.setName(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }

    @Override
    public String getName() {
        return null;
    }

    private void setName(String name) {
        this.name = name;
    }
}
