package com.example.marketplace.web;

import com.example.marketplace.dao.model.CustomerOrder;
import com.example.marketplace.services.crud.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerOrderController {
    @Autowired
    private CustomerOrderService orderService;

    @GetMapping("/insertCustomerOrder")
    public ResponseEntity<CustomerOrder> insertOrder() {
        return new ResponseEntity<>(orderService.createOrder(), HttpStatus.OK);
    }

    @GetMapping("/getCustomerOrder")
    public ResponseEntity<CustomerOrder> getOrder(@RequestParam("order_id") Long id) {
        return new ResponseEntity<>(orderService.findOrderById(id), HttpStatus.OK);
    }
}