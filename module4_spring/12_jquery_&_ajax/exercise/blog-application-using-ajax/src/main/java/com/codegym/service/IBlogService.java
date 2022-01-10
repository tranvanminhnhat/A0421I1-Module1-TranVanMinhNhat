package com.codegym.service;

import com.codegym.model.Blog;

import java.util.Optional;

public interface IBlogService {
    Iterable<Blog> findAll();

    Optional<Blog> findById(Long id);

    Blog save(Blog smartPhone);

    void remove(Long id);

    Iterable<Blog> findByTitles(String title);
}
