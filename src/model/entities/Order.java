package model.entities;

import model.enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private final List<Product> products = new ArrayList<>();
    private Client client;
    private OrderStatus status = OrderStatus.PENDING_PAYMENT;

    public Order(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
