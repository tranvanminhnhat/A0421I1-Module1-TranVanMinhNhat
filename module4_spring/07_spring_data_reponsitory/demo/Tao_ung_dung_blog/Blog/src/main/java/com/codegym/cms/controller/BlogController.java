package com.codegym.cms.controller;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import com.codegym.cms.service.IBlogService;
import com.codegym.cms.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@Transactional
public class BlogController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> categories(){
        return categoryService.findAll();
    }

//    @GetMapping("/blog")
//    public ModelAndView home(Model model){
//        model.addAttribute("blogs", blogService.findAll());
//        ModelAndView modelAndView = new ModelAndView("/blog/home");
//        return modelAndView;
//    }

//    @GetMapping("/blog")
//    public ModelAndView home(Model model, @RequestParam(value = "page", defaultValue = "0")int page){
//        model.addAttribute("blogs", blogService.findAll(PageRequest.of(page,5, Sort.by("title"))));
//        ModelAndView modelAndView = new ModelAndView("/blog/home");
//        return modelAndView;
//    }

    @GetMapping("/blog")
    public ModelAndView home(@RequestParam("search") Optional<String> search, Model model, @RequestParam(value = "page", defaultValue = "0")int page){
        if (search.isPresent()){
            model.addAttribute("blogs", blogService.findByTitle(search.get(), PageRequest.of(page,5, Sort.by("title"))));
        }else {
            model.addAttribute("blogs", blogService.findAll(PageRequest.of(page,5, Sort.by("title"))));
        }
        ModelAndView modelAndView = new ModelAndView("/blog/home");
        return modelAndView;
    }

    @GetMapping("/blog-create")
    public String getCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "/blog/create";
    }

    @PostMapping("/blog-create")
    public ModelAndView postCreate(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        return modelAndView;
    }

    @GetMapping("/{id}/blog-edit")
    public ModelAndView getEdit(@PathVariable Long id){
        ModelAndView modelAndView =new ModelAndView("/blog/edit");
        modelAndView.addObject("blog",blogService.findById(id));
        return modelAndView;
    }

    @PostMapping("/blog-update")
    public String update(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("msg", "Update Blog with Id:" +
                blog.getId() + "success");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/blog-delete")
    public ModelAndView getDelete(@PathVariable Long id){
        ModelAndView modelAndView =new ModelAndView("/blog/delete");
        modelAndView.addObject("blog",blogService.findById(id));
        return modelAndView;
    }

    @PostMapping("/blog-delete")
    public String postDelete(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes){
        blogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("msg", "Delete Blog with Id:" +
                blog.getId() + "success");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/blog-view")
    public ModelAndView view(@PathVariable Long id){
        ModelAndView modelAndView =new ModelAndView("/blog/view");
        modelAndView.addObject("blog",blogService.findById(id));
        return modelAndView;
    }
}
