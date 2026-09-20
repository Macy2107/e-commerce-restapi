package com.example.great.great.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
//@Table(name = "item")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String price;

    public Product() {

    }
    public Product(Long id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
