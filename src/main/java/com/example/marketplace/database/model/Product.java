package com.example.marketplace.database.model;

import jakarta.persistence.*;

/*
 */

public class Product {
    private Long id;
    private String name;
    private Long price;
    private Category category;
    private String description;
    private Seller seller;

}
