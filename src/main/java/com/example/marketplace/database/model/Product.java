package com.example.marketplace.database.model;

/*
create table product (
productID bigserial primary key,
productPrice bigserial,
productCategory varchar(256),
productDesc varchar(256),
seller bigserial references seller(sellerID)
)
 */

public class Product {
    private String name;
    private long price;
    private Category category;
    private String description;
    private Seller seller;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
