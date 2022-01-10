package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private IBlogService BlogService;

    @PostMapping
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(BlogService.save(blog), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ModelAndView getAllBlogPage(){
        ModelAndView modelAndView = new ModelAndView("/blogs/list");
        modelAndView.addObject("blogs", BlogService.findAll());
        return modelAndView;
    }

    @GetMapping
    public ResponseEntity<Iterable<Blog>> allBlogs(){
        return new ResponseEntity<>(BlogService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> deleteBlog(@PathVariable Long id){
        Optional<Blog> blogOptional = BlogService.findById(id);
        if (!blogOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        BlogService.remove(id);
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<Iterable<Blog>> allBlogSearch(@RequestParam(value = "search") String title){
        return new ResponseEntity<>(BlogService.findByTitles(title), HttpStatus.OK);
    }
}
