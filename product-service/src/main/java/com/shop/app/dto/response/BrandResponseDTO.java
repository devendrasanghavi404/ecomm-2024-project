package com.shop.app.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class BrandResponseDTO {
    private Integer brandId;
    private String brandName;
    private String brandDescription;

}
