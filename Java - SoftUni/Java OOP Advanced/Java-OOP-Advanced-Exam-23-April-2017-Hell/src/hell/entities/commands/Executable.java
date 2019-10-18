package hell.entities.commands;

import java.lang.reflect.InvocationTargetException;

public interface Executable {

    String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}
