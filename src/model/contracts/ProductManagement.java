package model.contracts;

import model.entities.Product;

public interface ProductManagement {
    
    void addProduct(Product product);
    void removeProduct(Product product);
}
