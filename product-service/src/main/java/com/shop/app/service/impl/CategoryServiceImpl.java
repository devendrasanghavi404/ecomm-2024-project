package com.shop.app.service.impl;

import com.shop.app.domain.Category;
import com.shop.app.dto.request.ProductRequestDTO;
import com.shop.app.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl {

    private CategoryRepository categoryRepository;
    private static Category category;

}
