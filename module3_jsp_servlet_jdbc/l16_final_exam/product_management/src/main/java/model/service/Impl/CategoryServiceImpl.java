package model.service.Impl;

import model.bean.Category;
import model.repository.CategoryRepository;
import model.repository.Impl.CategoryRepositoryImpl;
import model.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository = new CategoryRepositoryImpl();
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
