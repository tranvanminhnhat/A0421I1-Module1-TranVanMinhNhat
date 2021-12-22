package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blog",new Blog());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("message", "Create blog successfully");
        return modelAndView;
    }

    @GetMapping("/list")
    public ModelAndView showList(){
        List<Blog> blogs = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if (blog != null){
            ModelAndView modelAndView = new ModelAndView("blog/edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView editBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("blog/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Edit blog successfully");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if (blog != null){
            ModelAndView modelAndView = new ModelAndView("blog/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public ModelAndView deleteBlog(@ModelAttribute("blog") Blog blog){
        blogService.remove(blog.getBlogId());
        ModelAndView modelAndView = new ModelAndView("blog/delete");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Delete blog successfully");
        return modelAndView;
    }
}
