package com.codegym.controller;

import com.codegym.model.ElectronicMailBox;
import com.codegym.service.ElectronicMailBoxService;
import com.codegym.service.IElectronicMailBoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ElectronicMailBoxController {
    IElectronicMailBoxService electronicMailBoxService = new ElectronicMailBoxService();

    @GetMapping("/list")
    public String listMailBox(Model model){
        List<ElectronicMailBox> electronicMailBoxes = electronicMailBoxService.findAll();
        model.addAttribute("electronicMailBoxes", electronicMailBoxes);
        return "list";
    }

    @GetMapping("/update")
    public String showMailBoxDetail(@RequestParam("signature") String signature, ModelMap modelMap) {
        ElectronicMailBox electronicMailBox = electronicMailBoxService.findBySignature(signature);
        modelMap.addAttribute("electronicMailBox", electronicMailBox);
        modelMap.addAttribute("electronicMailBox", new ElectronicMailBox());
        return "update";
    }

    @PostMapping("/update")
    public String updateMailBox(@ModelAttribute("electronicMailBox") ElectronicMailBox electronicMailBox, ModelMap model){
        electronicMailBoxService.save(electronicMailBox);
        List<ElectronicMailBox> electronicMailBoxes = electronicMailBoxService.findAll();
        model.addAttribute("electronicMailBoxes", electronicMailBoxes);
        return "list";
    }
}
