package codegym.com.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CovertController {
    @GetMapping("/convert")
    public ModelAndView showConvertingForm(){
        ModelAndView modelAndView = new ModelAndView("convert");
        return modelAndView;
    }

    @PostMapping("/convert")
    public String Result(@RequestParam String vnd, Model model){
        int dollar = Integer.parseInt(vnd)/23;
        model.addAttribute("dollar", dollar);
        return "result";
    }
}
