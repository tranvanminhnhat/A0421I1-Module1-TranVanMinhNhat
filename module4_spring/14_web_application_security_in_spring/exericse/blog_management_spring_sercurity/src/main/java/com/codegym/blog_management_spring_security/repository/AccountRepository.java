package com.codegym.blog_management_spring_security.repository;

import com.codegym.blog_management_spring_security.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findAccountByUsername(String username);
}
