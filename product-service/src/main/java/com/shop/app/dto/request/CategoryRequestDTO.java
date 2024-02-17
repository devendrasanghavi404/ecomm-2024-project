package com.shop.app.dto.request;

import lombok.*;

import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CategoryRequestDTO {
    private String categoryName;
    private String categoryDescription;
}
