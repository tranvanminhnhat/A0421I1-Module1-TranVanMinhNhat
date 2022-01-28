package com.codegym.furama.controller;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class UserController {
    @GetMapping
    public ModelAndView showFormLogin(){
        ModelAndView modelAndView = new ModelAndView("/login");
        return modelAndView;
    }
}
