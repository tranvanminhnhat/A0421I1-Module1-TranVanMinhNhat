package model.repository.Impl;

import model.bean.Category;
import model.bean.Product;
import model.repository.CategoryRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL_CATEGORY = "SELECT * FROM category;";

    @Override
    public List<Category> findAll() {
        List<Category> categoryList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDatabase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CATEGORY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int category_id = resultSet.getInt("category_id");
                String category_name = resultSet.getString("category_name");
                Category category = new Category(category_id, category_name);
                categoryList.add(category);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }
}
