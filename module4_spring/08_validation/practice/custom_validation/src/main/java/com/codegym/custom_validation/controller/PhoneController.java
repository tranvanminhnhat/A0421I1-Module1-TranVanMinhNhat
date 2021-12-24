package com.codegym.custom_validation.controller;

import com.codegym.custom_validation.model.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PhoneController {
    @GetMapping("/")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("phoneNumber", new PhoneNumber());
        return modelAndView;
    }
    @PostMapping("/")
    public ModelAndView checkValidation (@Validated @ModelAttribute("phoneNumber")PhoneNumber phoneNumber, BindingResult bindingResult){
        new PhoneNumber().validate(phoneNumber, bindingResult);
        if (bindingResult.hasErrors()){
            return new ModelAndView("/index");
        }
        return new ModelAndView("/result");
    }
}
