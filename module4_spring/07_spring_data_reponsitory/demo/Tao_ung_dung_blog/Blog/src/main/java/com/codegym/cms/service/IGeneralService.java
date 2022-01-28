package com.codegym.cms.service;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}
