package com.codegym.cms.service;

import com.codegym.cms.model.Blog;
import com.codegym.cms.reponsitory.IBlogReponsitory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IBlogService extends IGeneralService<Blog>{
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findByTitle(String title,Pageable pageable);
}
