package com.example.marketplace.model;

public class ProductOrder {
    private final OrderID orderID;
    private final Product product;

    public ProductOrder(OrderID orderID, Product product) {
        this.orderID = orderID;
        this.product = product;
        GlobalProperties.addToGlobal(this);
    }

    public OrderID getOrderID() {
        return orderID;
    }

    public Product getProduct() {
        return product;
    }
}
