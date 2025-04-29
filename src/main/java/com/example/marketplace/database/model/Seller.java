package com.example.marketplace.database.model;

/*
create table seller (
sellerID bigserial primary key,
sellerRating double precision,
sellerDect varchar(256)
)
 */

public class Seller {
    private String name;
    private double rating;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
