package model.service.Impl;

import model.bean.Product;
import model.repository.Impl.ProductRepositoryImpl;
import model.repository.ProductRepository;
import model.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public boolean update(Product product, int product_id) {
        return productRepository.update(product, product_id);
    }
}
