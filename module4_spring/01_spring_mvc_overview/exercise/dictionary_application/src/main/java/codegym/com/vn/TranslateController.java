package codegym.com.vn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TranslateController {
    @GetMapping("/translate")
    public String showTranslateForm(){
        return "translate";
    }

    @PostMapping("/translate")
    public ModelAndView translate(@RequestParam String englishWord, Model model){
        Map<String, String> map = new HashMap<>();
        map.put("hello", "xin chao");
        ModelAndView modelAndView = new ModelAndView("result");
        model.addAttribute("result", map.get(englishWord));
        return modelAndView;
    }
}
