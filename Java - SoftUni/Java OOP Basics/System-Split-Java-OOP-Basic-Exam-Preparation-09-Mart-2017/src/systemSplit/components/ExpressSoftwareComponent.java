package systemSplit.components;

public class ExpressSoftwareComponent extends SoftwareComponent {
    private static final String TYPE = "Express";


    public ExpressSoftwareComponent(String name, int capacity, int memory) {
        super(name, TYPE);
        this.setMemory(memory);
        super.setCapacity(capacity);
    }

    @Override
    protected void setMemory(int memory) {
        super.setMemory(memory * 2);
    }

}
