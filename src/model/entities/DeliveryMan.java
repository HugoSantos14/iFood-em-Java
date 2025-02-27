package model.entities;

import model.enums.Marketplace;

public class DeliveryMan extends User {

    private Marketplace marketplace;
    private int age;
    private String motorcyclePlate;

    public DeliveryMan(String name, String login, String password, Marketplace marketplace, int age, String motorcyclePlate) {
        super(name, login, password);
        this.marketplace = marketplace;
        setAge(age);
        this.motorcyclePlate = motorcyclePlate;
    }

    public Marketplace getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("O entregador não pode ser menor de idade.");
        }
    }

    public String getMotorcyclePlate() {
        return motorcyclePlate;
    }

    public void setMotorcyclePlate(String motorcyclePlate) {
        this.motorcyclePlate = motorcyclePlate;
    }
}
