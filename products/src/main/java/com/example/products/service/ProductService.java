package com.example.products.service;

import com.example.products.dto.ProductResponse;
import com.example.products.dto.CreateProductRequest;
import com.example.products.dto.UpdateProductRequest;

import java.util.List;

public interface ProductService {
    ProductResponse create(CreateProductRequest request);
    List<ProductResponse> list();
    ProductResponse getById(Long id);
    ProductResponse update(Long id, UpdateProductRequest request);
    void delete(Long id);
} 
    



