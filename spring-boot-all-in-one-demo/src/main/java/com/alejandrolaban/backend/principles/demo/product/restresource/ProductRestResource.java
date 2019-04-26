package com.alejandrolaban.backend.principles.demo.product.restresource;

import com.alejandrolaban.backend.principles.demo.product.entity.ProductEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRestResource extends PagingAndSortingRepository<ProductEntity, Long> {
    List<ProductEntity> findByName(@Param("name") String name);
}
