package com.example.marketplace.database.model;

public class ProductOrder {
    private OrderID orderID;
    private Product product;

    public OrderID getOrderID() {
        return orderID;
    }

    public void setOrderID(OrderID orderID) {
        this.orderID = orderID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
