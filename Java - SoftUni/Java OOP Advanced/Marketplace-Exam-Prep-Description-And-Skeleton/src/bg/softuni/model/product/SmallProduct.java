package bg.softuni.model.product;


public class SmallProduct extends ProductAbstract {

    private static final double SIZE_MODIFIER = 0.5;

    public SmallProduct(int id, int size, String name) {
        super(id, size, name);
    }

    @Override
    public void setSize(int size) {
        super.setSize((int) (size * SIZE_MODIFIER));
    }
}
