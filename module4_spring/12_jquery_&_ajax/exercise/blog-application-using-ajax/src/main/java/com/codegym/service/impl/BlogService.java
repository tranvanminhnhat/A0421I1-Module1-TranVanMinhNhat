package com.codegym.service.impl;

import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private BlogRepository blog;

    @Override
    public Iterable<Blog> findAll() {
        return blog.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blog.findById(id);
    }

    @Override
    public Blog save(Blog smartPhone) {
        return blog.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        blog.deleteById(id);
    }

    @Override
    public Iterable<Blog> findByTitles(String title) {
        return blog.findBlogsByTitle(title);
    }
}
