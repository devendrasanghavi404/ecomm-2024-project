package com.shop.app.service.impl;

import com.shop.app.domain.Brand;
import com.shop.app.domain.Category;
import com.shop.app.domain.Product;
import com.shop.app.domain.SubCategory;
import com.shop.app.dto.request.ProductRequestDTO;
import com.shop.app.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl {
    private ProductProcessServiceImpl productProcessService;
    private ProductRepository productRepository;
    private static Product product;
    private static Brand brand;
    private static Category category;
    private static Set<SubCategory> subCategories;
    private static Set<Product> productSet;


}
