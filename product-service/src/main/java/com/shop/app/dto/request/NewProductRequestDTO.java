package com.shop.app.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
public class NewProductRequestDTO {
    private ProductRequestDTO product;
    private BrandRequestDTO brand;
    private CategoryRequestDTO category;
    private SubCategoryRequestDTO subCategory;
}
