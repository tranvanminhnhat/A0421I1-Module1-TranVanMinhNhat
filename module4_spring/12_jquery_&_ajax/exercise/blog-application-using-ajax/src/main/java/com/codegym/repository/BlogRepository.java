package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Blog, Long> {
    Iterable<Blog> findBlogsByTitle(String title);
}
