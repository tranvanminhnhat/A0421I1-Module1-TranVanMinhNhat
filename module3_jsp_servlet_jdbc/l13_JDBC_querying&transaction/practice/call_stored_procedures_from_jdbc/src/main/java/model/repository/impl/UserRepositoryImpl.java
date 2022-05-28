package model.repository.impl;

import model.bean.User;
import model.repository.UserRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    BaseRepository baseRepository = new BaseRepository();

    private final String SELECT_ALL_USERS = "SELECT * FROM users;";
    private final String SELECT_USER_BY_ID = "call get_user_by_id(?);";
    private final String INSERT_USER = "call insert_user(?,?,?,?)";

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDatabase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                users.add(new User(id, name, email, country));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }

    @Override
    public User getUserById(int id) {
        Connection connection = null;
        connection = baseRepository.connectDatabase();
        CallableStatement callableStatement = null;
        User user = null;
        try {
            callableStatement = connection.prepareCall(SELECT_USER_BY_ID);
            callableStatement.setInt(1, id);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                int user_id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(user_id, name, email, country);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean insertUser(User user) {
        Connection connection = null;
        connection =baseRepository.connectDatabase();
        boolean check = false;
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_USER);
            callableStatement.setInt(1, user.getId());
            callableStatement.setString(2, user.getName());
            callableStatement.setString(3, user.getEmail());
            callableStatement.setString(4, user.getCountry());
            check = callableStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }
}
