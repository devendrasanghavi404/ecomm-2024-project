package com.shop.app.service.impl;

import com.shop.app.domain.Brand;
import com.shop.app.domain.Category;
import com.shop.app.domain.Product;
import com.shop.app.domain.SubCategory;
import com.shop.app.dto.request.BrandRequestDTO;
import com.shop.app.dto.request.CategoryRequestDTO;
import com.shop.app.dto.request.NewProductRequestDTO;
import com.shop.app.dto.request.SubCategoryRequestDTO;
import com.shop.app.repository.BrandRepository;
import com.shop.app.repository.CategoryRepository;
import com.shop.app.repository.ProductRepository;
import com.shop.app.repository.SubCategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.HashSet;

@Service
@RequiredArgsConstructor
public class ProductProcessServiceImpl {
    private final ProductRepository productRepository;
    private final BrandRepository brandRepository;
    private final CategoryRepository categoryRepository;
    private final SubCategoryRepository subCategoryRepository;

    @Transactional
    public String createProductFromRequestAndSave(NewProductRequestDTO newProductRequestDTO) {
        Product product = mapToProduct(newProductRequestDTO);
        Brand brand = mapToBrand(newProductRequestDTO.getBrand());
        Category category = mapToCategory(newProductRequestDTO.getCategory());
        SubCategory subCategory = mapToSubCategory(newProductRequestDTO.getSubCategory());

        // Set associations
        category.getSubCategories().add(subCategory);
        brand.getCategories().add(category);
        product.setCategory(category);
        product.setBrand(brand);
        // Save the Product
        productRepository.save(product);

        return "data saved: success";
    }

    private SubCategory mapToSubCategory(SubCategoryRequestDTO subCategoryRequestDTO) {
        SubCategory subCategory = new SubCategory();
        subCategory.setSubCatName(subCategoryRequestDTO.getSubCatName());
        return subCategoryRepository.save(subCategory);
    }

    private Category mapToCategory(CategoryRequestDTO categoryRequestDTO) {
        Category category = new Category();
        category.setCategoryName(categoryRequestDTO.getCategoryName());
        category.setCategoryDescription(categoryRequestDTO.getCategoryDescription());
        return categoryRepository.save(category);
    }

    private Brand mapToBrand(BrandRequestDTO brandRequestDTO) {
        Brand brand = new Brand();
        brand.setBrandName(brandRequestDTO.getBrandName());
        brand.setBrandDescription(brandRequestDTO.getBrandDescription());
        return brandRepository.save(brand);
    }

    private Product mapToProduct(NewProductRequestDTO newProductRequestDTO) {
        Product product = new Product();
        product.setProductName(newProductRequestDTO.getProduct().getProductName());
        product.setProductDescription(newProductRequestDTO.getProduct().getProductDescription());
        product.setSku(newProductRequestDTO.getProduct().getSku());
        product.setPrice(newProductRequestDTO.getProduct().getPrice());
        product.setQuantity(newProductRequestDTO.getProduct().getQuantity());
        product.setInStock(newProductRequestDTO.getProduct().getInStock());
        product.setCreatedAt(Instant.now());
        product.setModifiedAt(Instant.now());
        return product;
    }

}
