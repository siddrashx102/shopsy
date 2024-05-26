package com.scaler.demo.service;

import com.scaler.demo.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(int id);
    List<Product> getAllProducts();
    Product createProduct(Product product);
}
