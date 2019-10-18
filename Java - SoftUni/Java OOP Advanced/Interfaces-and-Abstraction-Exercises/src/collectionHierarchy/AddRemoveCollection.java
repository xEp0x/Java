package collectionHierarchy;


public class AddRemoveCollection extends CustomCollection implements Addable, Removable {
    @Override
    public int add(String element) {
        super.getCollection().add(0, element);
        return 0;
    }

    @Override
    public String remove() {
        return super.getCollection().remove(super.getCollection().size() - 1);
    }
}
