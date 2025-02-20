package model.entities;

public class Drink extends Product {
    private int amount;
    private boolean alcoholic;

    public Drink(String name, int amount, boolean alcoholic) {
        super(name);
        this.amount = amount;
        this.alcoholic = alcoholic;
    }

    public Drink(String name, String description, double price, int preparationTime, int amount, boolean alcoholic) {
        super(name, description, price, preparationTime);
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
