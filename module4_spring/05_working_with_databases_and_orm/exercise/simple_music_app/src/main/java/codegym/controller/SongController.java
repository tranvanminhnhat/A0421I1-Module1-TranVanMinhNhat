package codegym.controller;

import codegym.entity.Song;
import codegym.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongRepository studentRepository;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("songs", studentRepository.getList());
        return "list";
    }

    @GetMapping("/create")
    public ModelAndView create(){
        ModelAndView modelAndView = new ModelAndView("create", "song", new Song());
        return modelAndView;
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Song song){
        studentRepository.save(song);
        return "redirect:/song/list";
    }
}
