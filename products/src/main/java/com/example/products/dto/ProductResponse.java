package com.example.products.dto;

import java.time.Instant;

public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private float price;
    private int stock;
    private Instant createdAt;

    public Long getId() {return id; }
    public void setId(Long id) {this.id = id; }

    public String getName() {return name; }
    public void setName(String name) {this.name = name; }

    public String getDescription() {return description; }
    public void setDescription(String description) {this.description = description; }

    public float getPrice() {return price; }
    public void setPrice(float price) {this.price = price; }

    public int getStock() {return stock; }
    public void setStock(int stock) {this.stock = stock; }

    public Instant getCreatedAt() {return createdAt; }
    public void setCreatedAt(Instant createdAt) {this.createdAt = createdAt; }
}