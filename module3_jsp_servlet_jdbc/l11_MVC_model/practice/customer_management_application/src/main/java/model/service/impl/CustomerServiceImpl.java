package model.service.impl;

import model.bean.Customer;
import model.reponsitory.CustomerRepository;
import model.reponsitory.impl.CustomerRepositoryImpl;
import model.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public boolean update(int id, Customer customer) {
        return customerRepository.update(id, customer);
    }

    @Override
    public boolean remove(int id) {
        return customerRepository.remove(id);
    }
}
