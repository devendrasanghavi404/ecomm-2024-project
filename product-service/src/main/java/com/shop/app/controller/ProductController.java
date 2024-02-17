package com.shop.app.controller;

import com.shop.app.dto.request.*;
import com.shop.app.service.impl.ProductProcessServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductProcessServiceImpl productProcessService;

    @PostMapping(value = "/product")
    public ResponseEntity<String> createProduct(@RequestBody NewProductRequestDTO newProductRequestDTO) {
        var message = productProcessService.createProductFromRequestAndSave(newProductRequestDTO);
        return ResponseEntity.ok(message);
    }


}
