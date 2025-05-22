package com.example.marketplace.services.crud;

import com.example.marketplace.dao.model.CustomerOrder;
import com.example.marketplace.dao.repositories.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderService {
    @Autowired
    private CustomerOrderRepository orderRepository;

    public CustomerOrder createOrder() {
        return orderRepository.save(generateOrder());
    }

    public CustomerOrder findOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow();
    }

    private CustomerOrder generateOrder() {
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setBuyer(1L);
        return customerOrder;
    }
}