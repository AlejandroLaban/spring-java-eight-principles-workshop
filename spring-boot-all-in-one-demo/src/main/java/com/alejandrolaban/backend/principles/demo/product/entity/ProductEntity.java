package com.alejandrolaban.backend.principles.demo.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "PRODUCT")
public class ProductEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    String name;

    @Column(name = "PRICE")
    BigDecimal price;
}
