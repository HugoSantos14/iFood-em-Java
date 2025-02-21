package model.contracts;

import model.entities.Order;
import model.entities.Product;

public interface OrderService {

    void addProductToOrder(Product product, Order order);
    void removeProductFromOrder(Product product, Order order);
}
