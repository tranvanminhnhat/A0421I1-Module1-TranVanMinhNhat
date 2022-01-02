package com.codegym.add_product_to_card.service;

import com.codegym.add_product_to_card.model.Product;

public interface ProductService {
    Iterable<Product> findAll();

    Product findById(Long id);

    void save(Product product);

    void remove(Long id);
}
