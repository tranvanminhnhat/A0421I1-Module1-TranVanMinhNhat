package com.codegym.furama.service;

import com.codegym.furama.entity.Contract;
import com.codegym.furama.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IContractService {

    void save(Contract contract);

    Page<Contract> findAll(Pageable pageable);

    Page<Contract> findAllByContractTotalMoney(Double contractTotalMoney, Pageable pageable);

    Optional<Contract> findById(Integer id);

    void remove(Integer id);
}
