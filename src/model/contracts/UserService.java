package model.contracts;

import model.entities.User;

public interface UserService {

    void saveUser(User user);
    User getUserById(int id);
}
