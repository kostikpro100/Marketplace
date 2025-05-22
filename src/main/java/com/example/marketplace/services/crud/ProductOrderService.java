package com.example.marketplace.services.crud;

import com.example.marketplace.dao.model.ProductOrder;
import com.example.marketplace.dao.repositories.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOrderService {
    @Autowired
    private ProductOrderRepository productOrderRepository;

    public ProductOrder createProductOrder() {
        return productOrderRepository.save(generateProductOrder());
    }

    public ProductOrder findProductOrderById(Long id) {
        return productOrderRepository.findById(id).orElseThrow();
    }

    private ProductOrder generateProductOrder() {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setOrder(1L);
        productOrder.setProduct(1L);
        productOrder.setPrice(500L);
        return productOrder;
    }
}