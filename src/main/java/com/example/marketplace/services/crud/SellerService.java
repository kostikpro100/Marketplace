package com.example.marketplace.services;

import com.example.marketplace.dao.model.Seller;
import com.example.marketplace.dao.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public Seller createSeller() {
        return sellerRepository.save(GenerateSeller());
    }

    public Seller findSellerById(Long id) {
        return sellerRepository.findById(id).orElseThrow();
    }

    private Seller GenerateSeller() {
        Seller seller = new Seller();
        seller.setName("PYATEROCHKA");
        seller.setRating(5.0);
        seller.setDescription("COOL SHOP! BUY PRODUCTS FROM HERE!");
        return seller;
    }
}
