package com.shop.app.dto.request;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class BrandRequestDTO {
    private String brandName;
    private String brandDescription;
}
