package eventImplementation;

import java.util.ArrayList;
import java.util.List;


public class Dispatcher {

    private String name;
    private List<NameChangeListener> listeners;

    public Dispatcher() {
        this.listeners = new ArrayList<>();
    }

    public void addNameChangeListener(NameChangeListener listener) {
        this.listeners.add(listener);
    }

    public void removeNameChangeListener(NameChangeListener listener) {
        this.listeners.remove(listener);
    }

    public void fireNameChangeEvent(NameChange event) {
        this.name = event.getChangedName();
        for (NameChangeListener listener : this.listeners) {
            listener.handleChangedName(event);
        }
    }
}
