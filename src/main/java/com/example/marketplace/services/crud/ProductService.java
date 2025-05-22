package com.example.marketplace.services.crud;

import com.example.marketplace.dao.model.Product;
import com.example.marketplace.dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct() {
        return productRepository.save(generateProduct());
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    private Product generateProduct() {
        Product product = new Product();
        product.setName("морковка");
        product.setDescription("вкусная");
        product.setPrice(1000L);
        product.setCategory(1L);
        product.setSeller(1L);
        return product;
    }
}