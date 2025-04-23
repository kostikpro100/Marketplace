package com.example.marketplace.model;

public class OrderID {
    private final Buyer buyer;
    private final double price;

    public OrderID(Buyer buyer, double price) {
        this.buyer = buyer;
        this.price = price;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public double getPrice() {
        return price;
    }
}
