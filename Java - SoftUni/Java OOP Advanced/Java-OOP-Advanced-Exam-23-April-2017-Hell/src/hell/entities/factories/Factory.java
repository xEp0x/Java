package hell.entities.factories;

import java.lang.reflect.InvocationTargetException;

public interface Factory<T> {

    T create(String... data) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
