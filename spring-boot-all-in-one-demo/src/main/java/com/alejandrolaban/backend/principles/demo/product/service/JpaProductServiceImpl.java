package com.alejandrolaban.backend.principles.demo.product.service;

import com.alejandrolaban.backend.principles.demo.product.entity.ProductEntity;
import com.alejandrolaban.backend.principles.demo.product.mapper.ProductMapper;
import com.alejandrolaban.backend.principles.demo.product.dto.ProductDto;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class JpaProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;
    private final EntityManager entityManager;

    public JpaProductServiceImpl(ProductMapper productMapper, EntityManager entityManager) {
        this.productMapper = productMapper;
        this.entityManager = entityManager;
    }

    @Override
    public ProductEntity getProduct(Long id) {
        return null;
    }

    @Override
    public ProductDto create(ProductDto productDto) {
        ProductEntity productEntity = productMapper.productDtoToEntity(productDto);
        entityManager.persist(productEntity);
        return productMapper.productEntityToDto(productEntity);
    }

    @Override
    public ProductDto getProductDto(Long id) {
        ProductEntity productEntity = new ProductEntity();
        return productMapper.productEntityToDto(productEntity);
    }
}
