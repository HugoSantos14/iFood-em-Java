package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    
    private String name;
    private String address;
    private final List<Product> products = new ArrayList<>();

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }
}
