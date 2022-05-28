package model.service;

import model.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User getUserById(int id);
    boolean insertUser(User user);
}
