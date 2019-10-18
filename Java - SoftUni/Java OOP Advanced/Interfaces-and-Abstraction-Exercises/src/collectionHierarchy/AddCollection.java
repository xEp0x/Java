package collectionHierarchy;


public class AddCollection extends CustomCollection implements Addable {

    @Override
    public int add(String element) {
        super.getCollection().add(element);
        return super.getCollection().size() - 1;
    }
}
