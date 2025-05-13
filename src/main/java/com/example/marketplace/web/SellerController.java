package com.example.marketplace.web;

import com.example.marketplace.dao.model.Seller;
import com.example.marketplace.services.crud.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {
    @Autowired
    private SellerService sellerService;

    @GetMapping("/insertSeller")
    public ResponseEntity<Seller> insertUser() {
        return new ResponseEntity<>(sellerService.createSeller(), HttpStatus.OK);
    }

    @GetMapping("/getSeller")
    public ResponseEntity<Seller> getSeller(@RequestParam(name = "seller_id") Long id) {
        return new ResponseEntity<>(sellerService.findSellerById(id), HttpStatus.OK);
    }
}
