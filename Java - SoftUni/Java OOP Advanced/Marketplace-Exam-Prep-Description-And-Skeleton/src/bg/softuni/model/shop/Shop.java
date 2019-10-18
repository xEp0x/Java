package bg.softuni.model.shop;

import bg.softuni.model.product.Product;


public interface Shop<S> {

    Iterable<Product> getProducts();

    Shop addProduct(Product product);
}
