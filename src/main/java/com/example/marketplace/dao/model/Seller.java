package com.example.marketplace.dao.model;

import jakarta.persistence.*;

/*
create table seller (
seller_id bigserial primary key,
seller_rating double precision,
seller_desc varchar(1024),
seller_name varchar(256)
)
 */

@Table(name = "seller")
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private Long id;
    @Column(name = "seller_name")
    private String name;
    @Column(name = "seller_rating")
    private Double rating;
    @Column(name = "seller_desc")
    private String description;

    public Seller() {}

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

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
