package com.example.marketplace.dao.model;

import jakarta.persistence.*;

/*
create table customer_order (
order_id bigserial primary key,
buyer_id bigint references buyer(buyer_id)
)
 */

@Table(name = "customer_order")
@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;
    @Column(name = "buyer_id")
    private Long buyer;

    public CustomerOrder() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuyer() {
        return buyer;
    }

    public void setBuyer(Long buyer) {
        this.buyer = buyer;
    }
}
