package model.entities;

import model.enums.ProductCategory;

public class Food extends Product {
    
    private boolean vegetarian;
    private boolean vegan;

    public Food(String name, ProductCategory category) {
        super(name, category);
    }

    public Food(String name, String description, double price, int preparationTime, ProductCategory category, boolean vegetarian, boolean vegan) {
        super(name, description, price, preparationTime, category);
        this.vegetarian = vegetarian;
        this.vegan = vegan;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        if (!vegetarian) {
            vegan = false;
        }
        this.vegetarian = vegetarian;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        if (vegan) {
            vegetarian = true;
        }
        this.vegan = vegan;
    }
}
