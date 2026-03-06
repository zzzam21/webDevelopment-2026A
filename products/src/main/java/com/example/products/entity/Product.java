package com.example.products.entity; 

import java.time.Instant;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    
    //Llave Primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String name;

    @Column(length = 2000)
    private String description;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private int stock;

    @Column(nullable = false, updatable = false)
    private Instant createdAT;

    // Al momento de agregar un producto nuevo
    @PrePersist
    void onCreate() {
        Instant now = Instant.now();
        this.createdAT = now;
    }

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
    
    public Instant getCreatedAt() {
        return createdAT;
    }

    public void setCreatedAt(Instant createdAT) {
        this.createdAT = createdAT;
    }

}
