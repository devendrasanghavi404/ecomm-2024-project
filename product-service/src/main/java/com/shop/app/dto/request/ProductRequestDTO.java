package com.shop.app.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
public class ProductRequestDTO {
    private String productName;
    private String productDescription;
    private String sku;
    private Float price;
    private Integer quantity;
    private Boolean inStock;
}
