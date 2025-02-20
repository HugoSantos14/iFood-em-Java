package model.entities;

public class RestaurantOwner extends User {
    private Restaurant restaurant;

    public RestaurantOwner(String login, String password, Restaurant restaurant) {
        super(login, password);
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
