package com.codegym.validate_register_form.controller;

import com.codegym.validate_register_form.Service.IUserService;
import com.codegym.validate_register_form.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/register")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/register")
    public ModelAndView registerUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        new User().validate(user, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return new ModelAndView("/index");
        }
        return new ModelAndView("/result");
    }
}
