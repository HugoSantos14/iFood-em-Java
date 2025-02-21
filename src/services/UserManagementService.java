package services;

import java.util.ArrayList;
import java.util.List;

import model.contracts.UserService;
import model.entities.User;

public class UserManagementService {
    
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("Usuário adicionado: " + user.getLogin());
    }

    public void removeUser(String username) {
        users.removeIf(user -> user.getLogin().equalsIgnoreCase(username));
        System.out.println("Usuário removido: " + username);
    }
}
