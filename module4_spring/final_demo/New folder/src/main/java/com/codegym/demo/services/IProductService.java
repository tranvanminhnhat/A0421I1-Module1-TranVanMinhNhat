package com.codegym.demo.services;

import com.codegym.demo.entities.Category;
import com.codegym.demo.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IProductService {
    void save(Product product);

    Page<Product> findAll(Pageable pageable);

    Page<Product> findAllByProductNameContainingAndProductPriceAndCategory(String name, Double price, Category category, Pageable pageable);

    Page<Product> findAllByProductNameContainingAndCategory(String name, Category category, Pageable pageable);

    Optional<Product> findById(Integer id);

    void remove(Integer id);

}
