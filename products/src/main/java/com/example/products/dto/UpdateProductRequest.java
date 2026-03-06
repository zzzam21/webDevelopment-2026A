package com.example.products.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UpdateProductRequest {
    @NotBlank(message = "Name is required")
    @Size(max = 120, message = "name must be <= 120 chars")
    private String name;

    @Size(max = 2000, message = "description must be <= 2000 chars")
    private String description;

    @NotNull(message = "Price is required")
    private float price;

    @NotNull(message = "Stock is required")
    private int stock;

    //Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
