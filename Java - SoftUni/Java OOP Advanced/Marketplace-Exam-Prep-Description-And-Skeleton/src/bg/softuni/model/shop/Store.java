package bg.softuni.model.shop;


public class Store extends ShopAbstract<Bazaar> {

    private static final long MAX_CAPACITY = 15;

    public Store(Bazaar successor) {
        super(successor, MAX_CAPACITY);
    }
}
