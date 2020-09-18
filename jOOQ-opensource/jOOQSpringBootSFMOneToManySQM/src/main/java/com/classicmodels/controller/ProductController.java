package com.classicmodels.controller;

import com.classicmodels.pojo.ProductLineDTO;
import com.classicmodels.service.ProductService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/productline")
    public List<ProductLineDTO> fetchProductLineWithProducts() {

        return productService.fetchProductLineWithProducts();
    }
}
