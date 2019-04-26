package com.alejandrolaban.backend.principles.demo.product.service;

import com.alejandrolaban.backend.principles.demo.product.entity.ProductEntity;
import com.alejandrolaban.backend.principles.demo.product.dto.ProductDto;
import org.springframework.stereotype.Component;

@Component
public class DummyProductServiceImpl implements ProductService {

    @Override
    public ProductEntity getProduct(Long id) {
        return new ProductEntity();
    }

    @Override
    public ProductDto create(ProductDto productDto) {
        return null;
    }
}
