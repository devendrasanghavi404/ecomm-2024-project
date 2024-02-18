package com.shop.app.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "tb_products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    private String productName;
    private String productDescription;
    private String sku;
    private Float price;
    private Integer quantity;
    private Boolean inStock;
    private Instant createdAt;
    private Instant modifiedAt;

    @ManyToOne
    @JoinColumn(name = "fk_brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "fk_category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "fk_sub_category_id")
    private SubCategory subCategory;


}