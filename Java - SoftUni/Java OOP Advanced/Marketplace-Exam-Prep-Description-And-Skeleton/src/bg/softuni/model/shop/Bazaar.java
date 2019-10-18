package bg.softuni.model.shop;


public class Bazaar extends ShopAbstract<Mall> {

    private static final long MAX_CAPACITY = 30;

    public Bazaar(Mall successor) {
        super(successor, MAX_CAPACITY);
    }
}
