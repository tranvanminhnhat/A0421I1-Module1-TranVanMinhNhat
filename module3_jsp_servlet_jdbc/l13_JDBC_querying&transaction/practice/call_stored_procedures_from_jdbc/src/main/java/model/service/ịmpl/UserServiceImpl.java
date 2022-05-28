package model.service.ịmpl;

import model.bean.User;
import model.repository.UserRepository;
import model.repository.impl.UserRepositoryImpl;
import model.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public boolean insertUser(User user) {
        return userRepository.insertUser(user);
    }
}
