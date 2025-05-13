package com.example.marketplace.dao.model;

import jakarta.persistence.*;

/*
create table product (
product_id bigserial primary key,
product_name varchar(256),
product_desc varchar(1024),
product_price bigint,
category_id bigint references category(category_id),
seller_id bigint references seller(seller_id)
)
 */

@Table(name = "product")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_desc")
    private String description;
    @Column(name = "product_price")
    private Long price;
    @Column(name = "category_id")
    private Long category;
    @Column(name = "seller_id")
    private Long seller;

    public Product() {}

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public Long getSeller() {
        return seller;
    }

    public void setSeller(Long seller) {
        this.seller = seller;
    }
}
