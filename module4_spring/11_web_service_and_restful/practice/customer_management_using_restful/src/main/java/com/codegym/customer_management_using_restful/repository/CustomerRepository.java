package com.codegym.customer_management_using_restful.repository;

import com.codegym.customer_management_using_restful.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
