package model.repository.Impl;

import model.bean.Category;
import model.bean.Product;
import model.repository.ProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL_PRODUCT = "SELECT * FROM product join category on category.category_id = product.category_id;";
    private final String INSERT_INTO_PRODUCT = "INSERT INTO product(product_name, product_price, product_quantity, product_color, product_description, category_id) VALUES (?, ?, ?, ?, ?, ?);";
    private final String SELECT_PRODUCT_BY_ID = "SELECT * FROM product WHERE product_id = ?";
    private final String UPDATE_PRODUCT = "UPDATE product SET product_name = ?, product_price = ?, product_quantity = ?, product_color = ?, product_description = ?, category_id = ? WHERE product_id = ?;";

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDatabase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                int product_quantity = resultSet.getInt("product_quantity");
                String product_color = resultSet.getString("product_color");
                String product_description = resultSet.getString("product_description");
                int category_id = resultSet.getInt("category_id");
                String category_name = resultSet.getString("category_name");
                Category category = new Category(category_id, category_name);

                Product product = new Product(product_id, product_name, product_price, product_quantity, product_color,product_description, category_id, category);
                productList.add(product);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public boolean save(Product product) {
        Connection connection = null;
        connection = baseRepository.connectDatabase();
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_PRODUCT);
            preparedStatement.setString(1, product.getProduct_name());
            preparedStatement.setDouble(2, product.getProduct_price());
            preparedStatement.setInt(3, product.getProduct_quantity());
            preparedStatement.setString(4, product.getProduct_color());
            preparedStatement.setString(5, product.getProduct_description());
            preparedStatement.setInt(6, product.getCategory_id());
            check = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return check;
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        Connection connection = null;
        connection = baseRepository.connectDatabase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                int product_quantity = resultSet.getInt("product_quantity");
                String product_color = resultSet.getString("product_color");
                String product_description = resultSet.getString("product_description");
                int category_id = resultSet.getInt("category_id");
                Category category = new Category(category_id);

                product = new Product(product_id, product_name, product_price, product_quantity, product_color,product_description, category_id, category);
            }
            preparedStatement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean update(Product product, int product_id) {
        Connection connection = null;
        connection = baseRepository.connectDatabase();
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT);
            preparedStatement.setString(1, product.getProduct_name());
            preparedStatement.setDouble(2, product.getProduct_price());
            preparedStatement.setInt(3, product.getProduct_quantity());
            preparedStatement.setString(4, product.getProduct_color());
            preparedStatement.setString(5, product.getProduct_description());
            preparedStatement.setInt(6, product.getCategory_id());
            preparedStatement.setInt(7, product.getProduct_id());

            check = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return check;
    }
}
