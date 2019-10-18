package pawInc.animals;

public class Dog extends Animal {

    private int amountOfCommands;

    public Dog(String name, int age, int amountOfCommands, String centerName) {
        super(name, age, centerName);
        this.setAmountOfCommands(amountOfCommands);
    }

    private void setAmountOfCommands(int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }
}
