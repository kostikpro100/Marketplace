package com.example.marketplace.web;

import com.example.marketplace.dao.model.Buyer;
import com.example.marketplace.services.crud.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @GetMapping("/insertBuyer")
    public ResponseEntity<Buyer> insertBuyer() {
        return new ResponseEntity<>(buyerService.createBuyer(), HttpStatus.OK);
    }

    @GetMapping("/getBuyer")
    public ResponseEntity<Buyer> getBuyer(@RequestParam("buyer_id") Long id) {
        return new ResponseEntity<>(buyerService.findBuyerById(id), HttpStatus.OK);
    }
}