package com.codegym.blog_management_spring_security.controller;

import com.codegym.blog_management_spring_security.model.Blog;
import com.codegym.blog_management_spring_security.service.IBlogService;
import com.codegym.blog_management_spring_security.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
    @Autowired
    IBlogService blogService;

    @Autowired
    ICategoryService categoryService;

    @GetMapping("/user/list")
    public ModelAndView getBlogList(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("blogs", blogService.findAll());
        return modelAndView;
    }

    @GetMapping("/admin/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/admin/create")
    public ModelAndView createBlog(@ModelAttribute Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("message", "create Successfully");
        return modelAndView;
    }

    @GetMapping("/admin/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("blog", blogService.findById(id).get());
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }

    @GetMapping("/admin/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("blog", blogService.findById(id).get());
        return modelAndView;
    }

    @PostMapping("/admin/delete")
    public String deleteBlog(@ModelAttribute Blog blog){
        blogService.remove(blog.getBlogId());
        return "redirect:/user/list";
    }

    @PostMapping("/admin/edit")
    public String editBlog(@ModelAttribute Blog blog){
        blogService.save(blog);
        return "redirect:/user/list";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/deny")
    public String denied(){
        return "denied";
    }

    @GetMapping("/logoutSuccess")
    public String logout() {
        return "logoutSuccess";
    }
}
