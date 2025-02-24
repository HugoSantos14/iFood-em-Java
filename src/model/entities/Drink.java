package model.entities;

import model.enums.ProductCategory;

public class Drink extends Product {

    private int amount;
    private boolean alcoholic;

    private static final ProductCategory category = ProductCategory.DRINKS;

    public Drink(String name, int amount) {
        super(name);
        this.amount = amount;
    }

    public Drink(String name, String description, double price, int preparationTime, int amount, boolean alcoholic) {
        super(name, description, price, preparationTime, category);
        this.amount = amount;
        this.alcoholic = alcoholic;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }
}
