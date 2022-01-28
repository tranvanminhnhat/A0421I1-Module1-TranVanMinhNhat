package com.codegym.blog_management_spring_security.repository;

import com.codegym.blog_management_spring_security.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
}
