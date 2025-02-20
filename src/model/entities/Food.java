package model.entities;

import model.enums.CuisineType;

public class Food extends Product {
    
    private CuisineType cuisine;
    private boolean vegetarian;
    private boolean vegan;

    public Food(String name, CuisineType cuisine) {
        super(name);
        this.cuisine = cuisine;
    }

    public Food(String name, String description, double price, int preparationTime, CuisineType cuisine) {
        super(name, description, price, preparationTime);
        this.cuisine = cuisine;
    }

    public CuisineType getCuisine() {
        return cuisine;
    }

    public void setCuisine(CuisineType cuisine) {
        this.cuisine = cuisine;
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
