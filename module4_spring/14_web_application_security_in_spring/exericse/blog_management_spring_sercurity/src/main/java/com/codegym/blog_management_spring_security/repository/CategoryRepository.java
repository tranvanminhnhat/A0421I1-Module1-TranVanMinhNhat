package com.codegym.blog_management_spring_security.repository;

import com.codegym.blog_management_spring_security.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
