package bg.softuni.provider.data;

import bg.softuni.model.product.Product;

import java.lang.reflect.InvocationTargetException;


public interface DataProvider {

    Product addProduct(int size, String name, String type) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException;

    Product getProductById(int id);
}
