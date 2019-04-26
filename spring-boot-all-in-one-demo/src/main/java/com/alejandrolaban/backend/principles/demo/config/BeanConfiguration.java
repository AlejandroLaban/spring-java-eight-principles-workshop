package com.alejandrolaban.backend.principles.demo.config;

import com.alejandrolaban.backend.principles.demo.product.service.DummyProductServiceImpl;
import com.alejandrolaban.backend.principles.demo.product.service.ProductService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(ProductProperties.class)
@Configuration
public class BeanConfiguration {

    private final ProductProperties productProperties;

    public BeanConfiguration(ProductProperties productProperties) {
        this.productProperties = productProperties;
    }

    @Bean("beanDummyProductServiceImpl")
    ProductService productService() {
        return new DummyProductServiceImpl(productProperties);
    }
}
