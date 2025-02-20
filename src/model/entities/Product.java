package model.entities;

public abstract class Product {
    
    private String name;
    private String description;
    private double price;
    private int preparationTime;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String description, double price, int preparationTime) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.preparationTime = preparationTime;
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
}
