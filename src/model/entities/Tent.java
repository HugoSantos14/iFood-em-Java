package model.entities;

import java.util.ArrayList;
import java.util.List;

public final class Tent {

    private int id;

    private String name;
    private String address;
    private final List<Product> products = new ArrayList<>();

    public Tent(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
