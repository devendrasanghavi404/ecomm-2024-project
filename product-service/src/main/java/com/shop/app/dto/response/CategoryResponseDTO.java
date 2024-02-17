package com.shop.app.dto.response;

import lombok.*;

import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CategoryResponseDTO {
    private Integer categoryId;
    private String categoryName;
    private String categoryDescription;
    private Set<SubCategoryResponseDTO> subCategoryResponseDTOSet;
}
