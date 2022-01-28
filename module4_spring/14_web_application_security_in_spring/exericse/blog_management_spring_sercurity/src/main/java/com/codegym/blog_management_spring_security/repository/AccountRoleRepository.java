package com.codegym.blog_management_spring_security.repository;

import com.codegym.blog_management_spring_security.model.AccountRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRoleRepository extends CrudRepository<AccountRole, Long> {
    @Query("select ar.role.roleName from AccountRole ar where ar.account.username = :username")
    List<String> findAllRoleByUser(String username);
}
