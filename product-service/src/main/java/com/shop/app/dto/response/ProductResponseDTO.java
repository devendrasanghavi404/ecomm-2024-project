package com.shop.app.dto.response;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ProductResponseDTO {
    private Integer productId;
    private String productMajorCategory;
    private String productSubCategory;
    private String productBrand;
    private String productName;
    private String productDescription;
    private String SKU;
    private Float price;
    private Integer quantity;
    private Boolean inStock;
    private BigDecimal createdAt;
    private BigDecimal modifiedAt;
}
