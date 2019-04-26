package com.alejandrolaban.backend.principles.demo.product.service;

import com.alejandrolaban.backend.principles.demo.config.ProductProperties;
import com.alejandrolaban.backend.principles.demo.product.entity.ProductEntity;
import com.alejandrolaban.backend.principles.demo.product.dto.ProductDto;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@EnableConfigurationProperties(ProductProperties.class)
@Component
public class DummyProductServiceImpl implements ProductService {

    public DummyProductServiceImpl(ProductProperties productProperties) {
        this.productProperties = productProperties;
    }

    private final ProductProperties productProperties;

    @Override
    public ProductEntity getProduct(Long id) {
        return new ProductEntity();
    }

    @Override
    public ProductDto create(ProductDto productDto) {
        return null;
    }

    @Override
    public Object getProperties() {
        return productProperties.toString();
    }
}
