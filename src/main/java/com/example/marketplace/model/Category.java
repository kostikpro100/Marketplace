package com.example.marketplace.model;

public class Category {
    private String category;

    public Category(String category) {
        this.category = category;
        GlobalProperties.addToGlobal(this);
    }

    public String getCategory() {
        return category;
    }
}