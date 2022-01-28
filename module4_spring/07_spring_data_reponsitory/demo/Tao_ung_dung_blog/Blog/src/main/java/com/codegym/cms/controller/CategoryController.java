package com.codegym.cms.controller;

import com.codegym.cms.model.Category;
import com.codegym.cms.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;

@Controller

public class CategoryController {
    @Autowired
    ICategoryService categoryService;

    @GetMapping("/category")
    public ModelAndView home(Model model){
        model.addAttribute("categories", categoryService.findAll());
        ModelAndView modelAndView = new ModelAndView("/category/home");
        return modelAndView;
    }

    @GetMapping("/category-create")
    public ModelAndView create(Model model){
        ModelAndView modelAndView = new ModelAndView("/category/create");
        model.addAttribute("category", new Category());
        return modelAndView;
    }

    @PostMapping("/category-create")
    public ModelAndView saveCategory(@ModelAttribute("category") Category category) {
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category", new Category());
        modelAndView.addObject("message", "New category created successfully");
        return modelAndView;
    }

    @GetMapping("/category-edit/{id}")
    public ModelAndView edit(@PathVariable Long id, Model model){
        model.addAttribute("category", categoryService.findById(id));
        ModelAndView modelAndView = new ModelAndView("/category/edit");
        return modelAndView;
    }
    @PostMapping("/category-edit")
    public ModelAndView editCategory(@ModelAttribute("category") Category category) {
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("redirect:/category");
        modelAndView.addObject("category", new Category());
        modelAndView.addObject("message", "New category update successfully");
        return modelAndView;
    }

    @GetMapping("/category-delete/{id}")
    public ModelAndView delete(@PathVariable Long id, Model model){
        model.addAttribute("category", categoryService.findById(id));
        ModelAndView modelAndView = new ModelAndView("/category/delete");
        return modelAndView;
    }
    @PostMapping("/category-delete")
    public ModelAndView deleteCategory(@ModelAttribute("category") Category category) {
        categoryService.remove(category.getId());
        ModelAndView modelAndView = new ModelAndView("redirect:/category");
        modelAndView.addObject("category", new Category());
        modelAndView.addObject("message", "New category delete successfully");
        return modelAndView;
    }

    @GetMapping("/views/{id}")
    public ModelAndView views(@PathVariable Long id, Model model){
        model.addAttribute("category", categoryService.findById(id));
        ModelAndView modelAndView = new ModelAndView("/category/views");
        return modelAndView;
    }
}
