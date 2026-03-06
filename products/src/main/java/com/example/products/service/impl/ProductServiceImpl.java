package com.example.products.service.impl;

import com.example.products.dto.*;
import com.example.products.entity.Product;
import com.example.products.exception.ResourceNotFoundException;
import com.example.products.repository.ProductRepository;
import com.example.products.service.ProductService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    private final ProductRepository repository;
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }
    @Override
    public ProductResponse create (CreateProductRequest request) {
        Product a = new Product();
        a.setName(request.getName());
        a.setDescription(request.getDescription());
        a.setPrice(request.getPrice());
        a.setStock(request.getStock());
        Product saved = repository.save(a);
        return toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductResponse> list() {
        return repository.findAll().stream().map(this::toResponse).toList();
    }
    
    @Override
    @Transactional(readOnly = true)
    public ProductResponse getById(Long id){
        Product p = repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Product" + id + "Not found"));
        
        return toResponse(p);
    }

    @Override
    public ProductResponse update(Long id, UpdateProductRequest request){
        Product p = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product " + id + " not found"));
        p.setName(request.getName());
        p.setDescription(request.getDescription());

        p.setPrice(request.getPrice());
        p.setStock(request.getStock());

        return toResponse(p);
    }

    @Override
    public void delete(Long id){
        if (!repository.existsById(id)){
            throw new ResourceNotFoundException("Product" + id + "not found");
        }
        repository.deleteById(id);
    }

    private ProductResponse toResponse(Product a) {
        ProductResponse r = new ProductResponse();
        r.setId(a.getId());
        r.setName(a.getName());
        r.setDescription(a.getDescription());
        r.setPrice(a.getPrice());
        r.setStock(a.getStock());
        r.setCreatedAt(a.getCreatedAt());
        return r;
    }

}