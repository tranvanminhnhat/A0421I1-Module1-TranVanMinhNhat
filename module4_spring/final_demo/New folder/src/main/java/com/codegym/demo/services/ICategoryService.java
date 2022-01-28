package com.codegym.demo.services;

import com.codegym.demo.entities.Category;
import org.springframework.stereotype.Service;

@Service
public interface ICategoryService {
    Iterable<Category> findAll();
}
