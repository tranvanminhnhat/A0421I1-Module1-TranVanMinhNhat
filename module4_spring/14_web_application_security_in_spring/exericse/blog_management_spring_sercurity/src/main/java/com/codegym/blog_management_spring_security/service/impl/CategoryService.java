package com.codegym.blog_management_spring_security.service.impl;

import com.codegym.blog_management_spring_security.model.Blog;
import com.codegym.blog_management_spring_security.model.Category;
import com.codegym.blog_management_spring_security.repository.CategoryRepository;
import com.codegym.blog_management_spring_security.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void save(Category blog) {
        categoryRepository.save(blog);
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.deleteById(id);
    }
}
