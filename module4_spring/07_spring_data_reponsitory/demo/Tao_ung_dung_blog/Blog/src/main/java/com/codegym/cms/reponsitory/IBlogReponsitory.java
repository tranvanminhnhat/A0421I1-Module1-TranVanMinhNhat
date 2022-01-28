package com.codegym.cms.reponsitory;

import com.codegym.cms.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogReponsitory extends PagingAndSortingRepository<Blog, Long> {
//    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findByTitle(String title,Pageable pageable);
}
