package collectionHierarchy;

import java.util.ArrayList;
import java.util.List;


public abstract class CustomCollection {

    private List<String> collection;

    protected CustomCollection() {
        this.collection = new ArrayList<>();
    }

    protected List<String> getCollection() {
        return this.collection;
    }
}
