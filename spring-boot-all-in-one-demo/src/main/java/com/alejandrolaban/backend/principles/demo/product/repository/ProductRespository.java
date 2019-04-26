package com.alejandrolaban.backend.principles.demo.product.repository;

import com.alejandrolaban.backend.principles.demo.product.entity.ProductEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRespository extends PagingAndSortingRepository<ProductEntity, Long> {

    List<ProductEntity> findAllByPrice(double price, Pageable pageable);
}
