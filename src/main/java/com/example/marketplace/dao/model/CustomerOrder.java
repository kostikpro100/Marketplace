package com.example.marketplace.dao.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private Set<ProductOrder> productsOrders = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Set<ProductOrder> getProductsOrders() {
        return productsOrders;
    }

    public void setProductsOrders(Set<ProductOrder> productsOrders) {
        this.productsOrders = productsOrders;
    }
}
