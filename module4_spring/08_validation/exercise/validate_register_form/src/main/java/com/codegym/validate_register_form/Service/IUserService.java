package com.codegym.validate_register_form.Service;

import com.codegym.validate_register_form.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    void save(User user);
}
