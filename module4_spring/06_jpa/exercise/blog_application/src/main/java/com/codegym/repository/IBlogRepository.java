package com.codegym.repository;

import com.codegym.model.Blog;

import java.util.List;

public interface IBlogRepository {
    void save(Blog blog);

    List<Blog> findAll();

    Blog findById(Long id);

    void remove(Long id);
}
