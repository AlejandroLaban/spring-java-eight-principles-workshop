package com.alejandrolaban.backend.principles.demo.config;

import com.alejandrolaban.backend.principles.demo.product.service.DummyProductServiceImpl;
import com.alejandrolaban.backend.principles.demo.product.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean("beanDummyProductServiceImpl")
    ProductService productService() {
        return new DummyProductServiceImpl();
    }
}
