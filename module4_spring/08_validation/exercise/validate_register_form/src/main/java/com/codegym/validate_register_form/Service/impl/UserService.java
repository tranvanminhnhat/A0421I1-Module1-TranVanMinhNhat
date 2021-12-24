package com.codegym.validate_register_form.Service.impl;

import com.codegym.validate_register_form.Service.IUserService;
import com.codegym.validate_register_form.entity.User;
import com.codegym.validate_register_form.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
