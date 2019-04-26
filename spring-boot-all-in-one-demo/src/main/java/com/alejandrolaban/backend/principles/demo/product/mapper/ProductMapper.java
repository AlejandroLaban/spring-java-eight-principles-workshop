package com.alejandrolaban.backend.principles.demo.product.mapper;

import com.alejandrolaban.backend.principles.demo.product.dto.ProductDto;
import com.alejandrolaban.backend.principles.demo.product.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto productEntityToDto(ProductEntity productEntity);

    ProductEntity productDtoToEntity(ProductDto productDto);
}
