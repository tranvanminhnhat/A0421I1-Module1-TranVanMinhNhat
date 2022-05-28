package model.service.impl;

import model.bean.Product;
import model.repository.RepositoryProduct;
import model.repository.impl.RepositoryProductImpl;
import model.service.ServiceProduct;
import java.util.List;

public class ServiceProductImpl implements ServiceProduct {
    RepositoryProduct repositoryProduct = new RepositoryProductImpl();
    @Override
    public List<Product> findAll() {
        return repositoryProduct.findAll();
    }

    @Override
    public void save(Product product) {
        repositoryProduct.save(product);
    }

    @Override
    public Product findById(int id) {
        return repositoryProduct.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        repositoryProduct.update(id, product);
    }

    @Override
    public void remove(int id) {
        repositoryProduct.remove(id);
    }

    @Override
    public Product search(String name) {
        return repositoryProduct.search(name);
    }
}
