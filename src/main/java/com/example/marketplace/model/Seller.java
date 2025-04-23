package com.example.marketplace.model;

import java.util.ArrayList;
import java.util.List;

public class Seller {
    private String name;
    private double rating;
    private String description;
    private List<Product> products;

    public Seller(String name, double rating, String description) {
        this.name = name;
        this.rating = rating;
        this.description = description;
        this.products = new ArrayList<>();
        GlobalProperties.addToGlobal(this);
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void deleteProduct(Product product) {
        this.products.remove(product);
    }
}
