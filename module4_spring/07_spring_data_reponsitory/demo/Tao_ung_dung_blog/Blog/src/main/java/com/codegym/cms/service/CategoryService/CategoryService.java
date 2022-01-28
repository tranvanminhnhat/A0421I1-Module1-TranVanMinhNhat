package com.codegym.cms.service.CategoryService;

import com.codegym.cms.model.Category;
import com.codegym.cms.reponsitory.ICategoryReponsitory;
import com.codegym.cms.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryReponsitory categoryReponsitory;

    @Override
    public Iterable<Category> findAll() {
        return categoryReponsitory.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryReponsitory.findById(id);
    }

    @Override
    public void save(Category category) {
        categoryReponsitory.save(category);
    }

    @Override
    public void remove(Long id) {
        categoryReponsitory.deleteById(id);
    }
}
