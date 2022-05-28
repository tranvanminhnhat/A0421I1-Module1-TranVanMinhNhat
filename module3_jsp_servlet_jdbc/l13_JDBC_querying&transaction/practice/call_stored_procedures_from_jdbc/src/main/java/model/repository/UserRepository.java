package model.repository;

import model.bean.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();

    User getUserById(int id);

    boolean insertUser(User user);
}
