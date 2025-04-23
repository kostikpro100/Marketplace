package com.example.marketplace.model;

public class Product {
    private String name;
    private double price;
    private Category category;
    private String description;
    private final Seller seller;

    public Product(String name, double price, Category category, String description, Seller seller) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.seller = seller;
        seller.addProduct(this);
        GlobalProperties.addToGlobal(this);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
