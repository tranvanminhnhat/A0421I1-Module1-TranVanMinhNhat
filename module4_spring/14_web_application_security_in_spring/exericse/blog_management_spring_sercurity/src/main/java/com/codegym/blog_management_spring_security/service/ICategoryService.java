package com.codegym.blog_management_spring_security.service;

import com.codegym.blog_management_spring_security.model.Blog;
import com.codegym.blog_management_spring_security.model.Category;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ICategoryService {
    void save(Category category);

    Iterable<Category> findAll();

    Optional<Category> findById(Long id);

    void remove(Long id);
}
