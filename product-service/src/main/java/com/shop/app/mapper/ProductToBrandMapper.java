package com.shop.app.mapper;

import com.shop.app.domain.Brand;
import com.shop.app.domain.Product;

public class ProductToBrandMapper {

    public Brand mapProductToBrand(Product product) {
        Brand brand = new Brand();
        brand.setBrandName(product.getBrand().getBrandName());
        brand.setBrandDescription(product.getBrand().getBrandDescription());
        // Other mappings as needed
        return brand;
    }

    public Product mapBrandToProduct(Brand brand) {
        Product product = new Product();
        product.setProductName(brand.getBrandName());
        product.setProductDescription(brand.getBrandDescription());
        // Other mappings as needed
        return product;
    }
}
