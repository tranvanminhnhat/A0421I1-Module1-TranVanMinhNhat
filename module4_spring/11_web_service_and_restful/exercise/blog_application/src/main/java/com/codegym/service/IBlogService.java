package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public interface IBlogService extends IGeneralService<Blog>{
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllDesc(Pageable pageable);

    Page<Blog> findAllByTitle(String title, Pageable pageable);
}
