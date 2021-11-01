package model.service;

import model.bean.Product;

import java.util.List;

public interface ServiceProduct {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

    Product search(String name);
}
