package com.shop.app.domain;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "tb_subcategories")
public class SubCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subCategoryId;
    private String subCatName;

    @ManyToOne
    @JoinColumn(name = "fk_category_id")
    private Category category;
}
