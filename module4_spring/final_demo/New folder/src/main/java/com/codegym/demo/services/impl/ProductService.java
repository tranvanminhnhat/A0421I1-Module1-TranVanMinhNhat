package com.codegym.demo.services.impl;

import com.codegym.demo.entities.Category;
import com.codegym.demo.entities.Product;
import com.codegym.demo.repositories.ProductRepository;
import com.codegym.demo.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Product> findAllByProductNameContainingAndProductPriceAndCategory(String name, Double price, Category category, Pageable pageable) {
        return productRepository.findAllByProductNameContainingAndProductPriceAndCategory(name, price, category, pageable);
    }

    @Override
    public Page<Product> findAllByProductNameContainingAndCategory(String name, Category category, Pageable pageable) {
        return productRepository.findAllByProductNameContainingAndCategory(name, category, pageable);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        productRepository.deleteById(id);
    }
}
