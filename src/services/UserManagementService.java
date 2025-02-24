package services;

import java.util.ArrayList;
import java.util.List;

import model.contracts.ManagementService;
import model.entities.User;

public class UserManagementService implements ManagementService<User> {

    private static final List<User> users = new ArrayList<>();
    private static int idCounter = 0;

    @Override
    public void create(User user) {
        user.setId(idCounter++);
        users.add(user);
        System.out.println("Usuário cadastrado: " + user.getName());
    }

    @Override
    public void remove(User user) {
        users.remove(user);
        System.out.println("Usuário excluído: " + user.getName());
    }

    @Override
    public User getById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }
}
