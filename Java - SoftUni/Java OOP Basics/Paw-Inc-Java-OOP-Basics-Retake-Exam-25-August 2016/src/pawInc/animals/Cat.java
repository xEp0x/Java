package pawInc.animals;


public class Cat extends Animal {

    private int intelligenceCoefficient;

    public Cat(String name, int age, int intelligenceCoefficient, String centerName) {
        super(name, age, centerName);
        this.setIntelligenceCoefficient(intelligenceCoefficient);
    }

    private void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }
}
