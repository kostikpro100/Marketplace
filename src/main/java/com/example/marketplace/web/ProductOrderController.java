package com.example.marketplace.web;

import com.example.marketplace.dao.model.ProductOrder;
import com.example.marketplace.services.crud.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductOrderController {
    @Autowired
    private ProductOrderService productOrderService;

    @GetMapping("/insertProductOrder")
    public ResponseEntity<ProductOrder> insertProductOrder() {
        return new ResponseEntity<>(productOrderService.createProductOrder(), HttpStatus.OK);
    }

    @GetMapping("/getProductOrder")
    public ResponseEntity<ProductOrder> getProductOrder(@RequestParam("product_order_id") Long id) {
        return new ResponseEntity<>(productOrderService.findProductOrderById(id), HttpStatus.OK);
    }
}