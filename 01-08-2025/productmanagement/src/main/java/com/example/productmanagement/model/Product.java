package com.example.productmanagement.model;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String productName;
    private String productMake;
    private double productPrice;

    // Constructors
    public Product() {}

    public Product(String productName, String productMake, double productPrice) {
        this.productName = productName;
        this.productMake = productMake;
        this.productPrice = productPrice;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductMake() {
        return productMake;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductMake(String productMake) {
        this.productMake = productMake;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}

