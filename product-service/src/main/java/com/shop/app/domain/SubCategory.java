package com.shop.app.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "tb_subcategories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class SubCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subCategoryId;
    private String subCatName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @OneToMany(mappedBy = "subCategory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore // To avoid infinite recursion in JSON serialization
    private Set<Product> products;

    @ManyToMany(mappedBy = "subCategories", cascade = CascadeType.ALL)
    private Set<Brand> brands;
}
