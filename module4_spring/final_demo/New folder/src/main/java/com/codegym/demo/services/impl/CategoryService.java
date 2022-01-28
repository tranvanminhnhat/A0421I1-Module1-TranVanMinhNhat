package com.codegym.demo.services.impl;

import com.codegym.demo.entities.Category;
import com.codegym.demo.repositories.CategoryRepository;
import com.codegym.demo.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }
}
