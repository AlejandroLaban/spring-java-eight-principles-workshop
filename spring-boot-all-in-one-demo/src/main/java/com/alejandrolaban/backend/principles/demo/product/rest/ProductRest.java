package com.alejandrolaban.backend.principles.demo.product.rest;

import com.alejandrolaban.backend.principles.demo.product.dto.ProductRequest;
import com.alejandrolaban.backend.principles.demo.product.service.ProductService;
import com.alejandrolaban.backend.principles.demo.product.dto.ProductDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "product")
public class ProductRest {

    private final ProductService productService;


    public ProductRest(ProductService jpaProductServiceImpl) {
        this.productService = jpaProductServiceImpl;
    }


    @RequestMapping(name = "get", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ProductDto getProductDto(ProductRequest productRequest) {
        return productService.getProductDto(productRequest.getId().longValue());
    }

    @RequestMapping(name = "add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ProductDto addProductDto(ProductRequest productRequest) {
        return productService.getProductDto(productRequest.getId().longValue());
    }


    @RequestMapping(name = "property", method = RequestMethod.GET)
    public ProductDto getProperties(ProductRequest productRequest) {
        return productService.getProductDto(productRequest.getId().longValue());
    }
}
