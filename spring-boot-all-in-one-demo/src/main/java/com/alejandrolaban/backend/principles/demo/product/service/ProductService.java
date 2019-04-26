package com.alejandrolaban.backend.principles.demo.product.service;

import com.alejandrolaban.backend.principles.demo.product.dto.ProductDto;
import com.alejandrolaban.backend.principles.demo.product.entity.ProductEntity;

public interface ProductService {

    ProductEntity getProduct(Long id);

    ProductDto create(ProductDto productDto);

    default ProductDto getProductDto(Long id) {
        return new ProductDto();
    }

}
