package model.contracts;

import model.entities.Product;
import model.entities.Restaurant;

public interface ProductService {

    void addProductToRestaurant(Product product, Restaurant restaurant);
    void removeProductFromRestaurant(Product product, Restaurant restaurant);
    void saveProduct(Product product);
    Product getProductById(int id);
}
