package model.service;

import model.bean.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    boolean save(Customer customer);

    Customer findById(int id);

    boolean update(int id, Customer customer);

    boolean remove(int id);
}
