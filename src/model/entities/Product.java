package model.entities;

import model.enums.ProductCategory;

public abstract class Product {

    private int id;

    private String name;
    private String description;
    private double price;
    private int preparationTime;

    private ProductCategory category;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, ProductCategory category) {
        this.name = name;
        this.category = category;
    }

    public Product(String name, String description, double price, int preparationTime, ProductCategory category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.preparationTime = preparationTime;
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}
