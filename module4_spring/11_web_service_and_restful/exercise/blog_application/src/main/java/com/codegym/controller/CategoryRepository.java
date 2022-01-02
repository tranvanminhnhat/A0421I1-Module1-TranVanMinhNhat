package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.BlogForm;
import com.codegym.model.Category;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/api/category")
public class CategoryRepository {
    @Autowired
    private ICategoryService categoryService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public String createBlog(@RequestBody Category category){
        categoryService.save(category);
        return "Success";
    }


    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Category> showList(){
        return categoryService.findAll();
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Category> updateBlog(@PathVariable Long id, @RequestBody Category category){
        Optional<Category> optionalCategory = categoryService.findById(id);
        if (!optionalCategory.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        category.setCategoryId(optionalCategory.get().getCategoryId());
        return new ResponseEntity<>(categoryService.save(category), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Category> deleteBlog(@PathVariable Long id){
        Optional<Category> categoryOptional = categoryService.findById(id);
        if (!categoryOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        categoryService.remove(id);
        return new ResponseEntity<>(categoryOptional.get(), HttpStatus.NO_CONTENT);
    }
}
