package methodOverriding;

public class Square extends Rectangle{

    public Square(Double side) {
        super(side);
    }

    @Override
    public Double calculateArea() {
        return this.getSideA() * this.getSideA();
    }
}
