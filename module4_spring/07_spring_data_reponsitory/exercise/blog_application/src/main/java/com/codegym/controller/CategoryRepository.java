package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/category")
public class CategoryRepository {
    @Autowired
    private ICategoryService categoryService;


    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("category/create");
        modelAndView.addObject("category",new Category());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createBlog(@ModelAttribute("category") Category category){
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("category/create");
        modelAndView.addObject("message", "Create category successfully");
        return modelAndView;
    }

    @GetMapping("/list")
    public ModelAndView showList(){
        Iterable<Category> categories = categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("category/list");
        modelAndView.addObject("categories", categories);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Optional<Category> category = categoryService.findById(id);
        if (category.isPresent()){
            ModelAndView modelAndView = new ModelAndView("category/edit");
            modelAndView.addObject("category", category);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView editBlog(@ModelAttribute("category") Category category){
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("category/edit");
        modelAndView.addObject("category", category);
        modelAndView.addObject("message", "Edit category successfully");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Optional<Category> category = categoryService.findById(id);
        if (category.isPresent()){
            ModelAndView modelAndView = new ModelAndView("category/delete");
            modelAndView.addObject("category", category);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public ModelAndView deleteBlog(@ModelAttribute("category") Category category){
        categoryService.remove(category.getCategoryId());
        ModelAndView modelAndView = new ModelAndView("category/delete");
        modelAndView.addObject("category", category);
        modelAndView.addObject("message", "Delete category successfully");
        return modelAndView;
    }
}
