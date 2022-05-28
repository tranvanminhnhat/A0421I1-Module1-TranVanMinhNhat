package model.repository.impl;

import model.bean.Product;
import model.repository.RepositoryProduct;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class RepositoryProductImpl implements RepositoryProduct {
    private BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL_PRODUCT = "SELECT * FROM product;";

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectionDatabase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String brand = resultSet.getString("brand");
                Double price = resultSet.getDouble("price");
                Product product = new Product(id, name, brand, price);
                products.add(product);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void save(Product product) {
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {
    }

    @Override
    public void remove(int id) {
    }

    @Override
    public Product search(String name) {
        return null;
    }
}
