package com.shop.app.mapper;

import com.shop.app.domain.Product;
import com.shop.app.domain.Category;

public class ProductToCategoryMapper {

    public Category mapProductToCategory(Product product) {
        Category category = new Category();

        // Other mappings as needed
        return category;
    }

    public Product mapCategoryToProduct(Category category) {
        Product product = new Product();
        // Other mappings as needed
        return product;
    }
}
