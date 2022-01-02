package com.codegym.add_product_to_card.repository;

import com.codegym.add_product_to_card.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
