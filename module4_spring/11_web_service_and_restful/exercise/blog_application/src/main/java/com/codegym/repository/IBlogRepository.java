package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;




@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog, Long> {
    @Query("select b from Blog  b order by b.date desc ")
    Page<Blog> findAllDesc(Pageable pageable);

    @Query("select b from Blog  b where b.title like :title")
    Page<Blog> findAllByTitleContaining(@Param("title") String title, Pageable pageable);
}
