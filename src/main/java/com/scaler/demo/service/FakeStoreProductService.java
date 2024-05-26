package com.scaler.demo.service;

import com.scaler.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        System.out.println("We are here...");
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
