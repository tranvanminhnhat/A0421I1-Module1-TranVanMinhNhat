package com.codegym.cms.reponsitory;

import com.codegym.cms.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICategoryReponsitory extends PagingAndSortingRepository<Category, Long> {
}
