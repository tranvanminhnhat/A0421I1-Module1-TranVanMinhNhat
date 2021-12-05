package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String showCalculatorScreen(){
        return "index";
    }

    @PostMapping("/calculator")
    public String result(@RequestParam("calculation") String calculation,
                        @RequestParam("number_1") int number_1,
                        @RequestParam("number_2") int number_2, Model model){
        String result = "";
        if (calculation.equals("+")){
            result = number_1 + number_2 + "";
        }else if (calculation.equals("-")){
            result = number_1 - number_2 + "";
        }else if (calculation.equals("*")){
            result = number_1 * number_2 + "";
        }else {
            if (number_2 == 0){
                result = "can not be divided by zero";
            }else {
                result = number_1/number_2 + "";
            }
        }
        model.addAttribute("result", result);
        return "index";
    }
}
