package com.example.marketplace.web;

import com.example.marketplace.dao.model.Product;
import com.example.marketplace.services.crud.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/insertProduct")
    public ResponseEntity<Product> insertProduct() {
        return new ResponseEntity<>(productService.createProduct(), HttpStatus.OK);
    }

    @GetMapping("/getProduct")
    public ResponseEntity<Product> getProduct(@RequestParam("product_id") Long id) {
        return new ResponseEntity<>(productService.findProductById(id), HttpStatus.OK);
    }
}