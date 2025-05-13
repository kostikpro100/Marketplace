package com.example.marketplace.dao.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
create table buyer (
buyer_id bigserial primary key,
buyer_login varchar(256),
buyer_pwd varchar(256),
buyer_nick varchar(256)
)

create table buyer_preferences (
buyer_id bigint references buyer(buyer_id),
category_id bigint references category(category_id),
primary key(buyer_id, category_id)
)
 */

@Table(name = "buyer")
@Entity
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buyer_id")
    private Long id;
    @Column(name = "buyer_login")
    private String login;
    @Column(name = "buyer_pwd")
    private String password;
    @Column(name = "buyer_nick")
    private String nickname;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "buyer_preferences",
            joinColumns = @JoinColumn(name = "buyer_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> preferences = new HashSet<>();
    @OneToMany(mappedBy = "buyer", fetch = FetchType.LAZY)
    private List<CustomerOrder> orders = new ArrayList<>();

    public Buyer() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Set<Category> getPreferences() {
        return preferences;
    }

    public void setPreferences(Set<Category> preferences) {
        this.preferences = preferences;
    }

    public List<CustomerOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<CustomerOrder> orders) {
        this.orders = orders;
    }
}
