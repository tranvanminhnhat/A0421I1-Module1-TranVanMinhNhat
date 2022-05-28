package model.reponsitory.impl;

import model.bean.Customer;
import model.reponsitory.CustomerRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CustomerRepositoryImpl implements CustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL = "SELECT * FROM customer;";
    private final String SELECT_BY_ID = "SELECT * FROM customer WHERE id = ?;";
    private final String INSERT_INTO = "INSERT INTO customer(`name`, email, address) values (?, ?, ?);";
    private final String UPDATE = "call update_customer(?,?,?,?);";
    private final String DELETE = "DELETE FROM customer WHERE id = ?";

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectionDatabase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String address =resultSet.getString("address");
                Customer customer = new Customer(id, name, email, address);
                customerList.add(customer);
            }
            preparedStatement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean save(Customer customer) {
        Connection connection = null;
        connection = baseRepository.connectionDatabase();
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getEmail());
            preparedStatement.setString(3, customer.getAddress());
            check = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        Connection connection = null;
        connection = baseRepository.connectionDatabase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id_info = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                customer = new Customer(id_info, name, email, address);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public boolean update(int id, Customer customer) {
        Connection connection = null;
        connection = baseRepository.connectionDatabase();
        boolean check = false;
        try{
            CallableStatement callableStatement = connection.prepareCall(UPDATE);

            callableStatement.setInt(1, customer.getId());
            callableStatement.setString(2, customer.getName());
            callableStatement.setString(3, customer.getEmail());
            callableStatement.setString(4, customer.getAddress());
            check = callableStatement.executeUpdate() > 0;
            callableStatement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean remove(int id) {
        Connection connection = null;
        connection = baseRepository.connectionDatabase();
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1,id);
            check = preparedStatement.executeUpdate() > 0;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return check;
    }
}
