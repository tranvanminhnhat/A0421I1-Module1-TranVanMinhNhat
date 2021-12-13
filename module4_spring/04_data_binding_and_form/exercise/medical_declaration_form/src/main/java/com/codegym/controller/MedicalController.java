package com.codegym.controller;

import com.codegym.model.MedicalDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MedicalController {
    // Bài tập sẽ được bỗ sung sau

    @GetMapping("/medicalForm")
    public ModelAndView showMedicalForm(Model model){
        ModelAndView modelAndView = new ModelAndView("medicalForm", "medicalDeclaration", new MedicalDeclaration());
        return modelAndView;
    }
}
