package com.shop.app.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class SubCategoryResponseDTO {
    private Integer subCatId;
    private String subCatName;
}
