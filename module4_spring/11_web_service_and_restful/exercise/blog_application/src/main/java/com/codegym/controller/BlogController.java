package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.BlogForm;
import com.codegym.service.IBlogService;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

//    @PostMapping("/sort")
//    public ModelAndView showListDesc(Pageable pageable){
//        Page<Blog> blogs = blogService.findAllDesc(pageable);
//        ModelAndView modelAndView = new ModelAndView("blog/list");
//        modelAndView.addObject("blogs", blogs);
//        return modelAndView;
//    }

//    @PostMapping("search")
//    public ModelAndView showSearchedList(@RequestParam String title, Pageable pageable){
//        Page<Blog> blogs = blogService.findAllByTitle(title, pageable);
//        ModelAndView modelAndView = new ModelAndView("blog/list");
//        modelAndView.addObject("blogs", blogs);
//        return modelAndView;
//    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public String createBlog(@RequestBody BlogForm blogForm){
        Blog blog = new Blog(blogForm.getBlogId(), blogForm.getTitle(), blogForm.getContent(), blogForm.getAuthor(), blogForm.getDate());
        blog.setCategory(categoryService.findById(blogForm.getCategoryId()).orElse(null));
        blogService.save(blog);
        return "Success";
    }

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Blog> showList(){
        return blogService.findAll();
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable Long id, @RequestBody BlogForm blogForm){
        Optional<Blog> blogGot = blogService.findById(id);
        if (!blogGot.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Blog blog = new Blog(blogForm.getBlogId(), blogForm.getTitle(), blogForm.getContent(), blogForm.getAuthor(), blogForm.getDate());
        blog.setCategory(categoryService.findById(blogForm.getCategoryId()).orElse(null));
        blog.setBlogId(blogGot.get().getBlogId());
        return new ResponseEntity<>(blogService.save(blog), HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Blog> deleteBlog(@PathVariable Long id){
        Optional<Blog> blogOptional = blogService.findById(id);
        if (!blogOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.remove(id);
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.NO_CONTENT);
    }
}
