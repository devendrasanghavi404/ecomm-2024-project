package com.shop.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_brands")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Brand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer brandId;
    private String brandName;
    private String brandDescription;
    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore // To avoid infinite recursion in JSON serialization
    private Set<Product> products;

    @ManyToMany(mappedBy = "brands", cascade = CascadeType.ALL)
    private Set<Category> categories;


}
