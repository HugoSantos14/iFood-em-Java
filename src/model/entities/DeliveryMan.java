package model.entities;

import model.enums.Fair;

public class DeliveryMan extends User {

    private Fair fair;
    private int age;
    private String motorcyclePlate;

    public DeliveryMan(String name, String login, String password, Fair fair, int age, String motorcyclePlate) {
        super(name, login, password);
        this.fair = fair;
        setAge(age);
        this.motorcyclePlate = motorcyclePlate;
    }

    public Fair getFair() {
        return fair;
    }

    public void setFair(Fair fair) {
        this.fair = fair;
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
