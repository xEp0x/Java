package bg.softuni.framework.dispatch;

import bg.softuni.framework.lifecycle.request.RequestMethod;

import java.lang.reflect.InvocationTargetException;


public interface Dispatcher {

    String dispatch(RequestMethod requestMethod, String uri) throws InvocationTargetException, IllegalAccessException;
}
