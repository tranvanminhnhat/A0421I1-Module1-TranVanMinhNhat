package com.codegym.blog_management_spring_security.service;

import com.codegym.blog_management_spring_security.model.Blog;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IBlogService {
    void save(Blog blog);

    Iterable<Blog> findAll();

    Optional<Blog> findById(Long id);

    void remove(Long id);
}
