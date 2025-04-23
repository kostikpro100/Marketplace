package com.example.marketplace.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalProperties {
    private static List<Seller> sellers = new ArrayList<>();
    private static List<Buyer> buyers = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();
    private static List<Category> categories = new ArrayList<>();
    private static List<ProductOrder> productOrders = new ArrayList<>();
    private static Map<Class, List> map = new HashMap<>(Map.of(
            Seller.class, sellers,
            Buyer.class, buyers,
            Product.class, products,
            Category.class, categories,
            ProductOrder.class, productOrders
    ));

    static public List<Seller> getSellers() {
        return sellers;
    }

    static public List<Buyer> getBuyers() {
        return buyers;
    }

    static public List<Product> getProducts() {
        return products;
    }

    static public List<Category> getCategories() {
        return categories;
    }

    static public List<ProductOrder> getProductOrders() {
        return productOrders;
    }

    static public <T> void addToGlobal(T element) {
        map.get(element.getClass()).add(element);
    }

    static public <T> void removeFromGlobal(T element) {
        map.get(element.getClass()).remove(element);
    }
}
