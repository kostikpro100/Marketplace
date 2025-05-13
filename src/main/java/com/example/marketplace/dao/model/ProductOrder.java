package com.example.marketplace.dao.model;

import jakarta.persistence.*;

/*
create table product_order (
product_order_id bigserial primary key,
customer_order_id bigint references customer_order(order_id),
product_id bigint references product(product_id),
product_price bigint
)
 */

@Table(name = "product_order")
@Entity
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_order_id")
    private Long id;
    @Column(name = "customer_order_id")
    private Long order;
    @Column(name = "product_id")
    private Long product;
    @Column(name = "product_price")
    private Long price;

    public ProductOrder() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
