package com.alejandrolaban.backend.principles.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties(prefix = "demo.product")
public class ProductProperties {

    private String text;
    private String header;
    private String authentication;
}
