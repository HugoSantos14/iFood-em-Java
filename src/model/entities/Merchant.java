package model.entities;

public class Merchant extends User {
    
    private Tent tent;

    public Merchant(String name, String login, String password, Tent tent) {
        super(name, login, password);
        this.tent = tent;
    }

    public Tent getTent() {
        return tent;
    }

    public void setTent(Tent tent) {
        this.tent = tent;
    }
}
