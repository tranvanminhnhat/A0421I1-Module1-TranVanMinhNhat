package model.reponsitory;

import model.bean.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    boolean save(Customer customer);

    Customer findById(int id);

    boolean update(int id, Customer customer);

    boolean remove(int id);
}
