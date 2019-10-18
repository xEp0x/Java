package bg.softuni.framework.container;

import java.lang.reflect.InvocationTargetException;


public interface Container {

    <T> T resolve(Class<T> typeToResolve) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException;

    void resolveDependencies(Object object) throws IllegalAccessException, InstantiationException;

    void addDependency(Class from, Object to);

}
