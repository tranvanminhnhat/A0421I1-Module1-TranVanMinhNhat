package model.service;

import model.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    boolean save(Product product);

    Product findById(int id);

    boolean update(Product product, int product_id);
}
