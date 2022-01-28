package com.codegym.demo.repositories;

import com.codegym.demo.entities.Category;
import com.codegym.demo.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

    Page<Product> findAllByProductNameContainingAndProductPriceAndCategory(String name, Double price, Category category, Pageable pageable);

    Page<Product> findAllByProductNameContainingAndCategory(String name, Category category, Pageable pageable);
}
