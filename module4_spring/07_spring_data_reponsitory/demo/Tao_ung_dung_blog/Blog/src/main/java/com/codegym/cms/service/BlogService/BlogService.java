package com.codegym.cms.service.BlogService;

import com.codegym.cms.model.Blog;
import com.codegym.cms.reponsitory.IBlogReponsitory;
import com.codegym.cms.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogReponsitory blogReponsitory;

    @Override
    public Iterable<Blog> findAll() {
        return blogReponsitory.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogReponsitory.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogReponsitory.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogReponsitory.deleteById(id);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogReponsitory.findAll(pageable);
    }

    @Override
    public Page<Blog> findByTitle(String title, Pageable pageable) {
        return blogReponsitory.findByTitle(title, pageable);
    }
}
