package model.repository.impl;

import model.bean.Product;
import model.repository.RepositoryProduct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositoryProductImpl implements RepositoryProduct {
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "IPhone X", "Apple", 12000000));
        products.put(2, new Product(2, "Samsung A37", "Samsung", 6000000));
        products.put(3, new Product(3, "IPhone 10", "Apple", 10000000));
        products.put(4, new Product(4, "Nokia A40", "Nokia", 5000000));
        products.put(5, new Product(5, "Vivo 12K", "Vivo", 9000000));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
