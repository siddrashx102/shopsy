package com.scaler.demo.controller;

import com.scaler.demo.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public void createProduct() {

    }

    @GetMapping("/product/{id}")
    public void getProduct(@PathVariable String id) {

    }

    @GetMapping("/product")
    public void getAllProduct() {
        productService.getAllProducts();
    }
}
