package application;

import java.util.Scanner;

import model.entities.Client;
import model.entities.Order;
import model.enums.OrderStatus;

public class Main {
    public static void main(String[] args) {
    
        try (Scanner sc = new Scanner(System.in)) {
            Order order = new Order(new Client("", "", ""));
            order.setStatus(OrderStatus.DELIVERED);
            System.out.println(order.getStatus().getDescription());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
