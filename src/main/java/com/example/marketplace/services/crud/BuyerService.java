package com.example.marketplace.services.crud;

import com.example.marketplace.dao.model.Buyer;
import com.example.marketplace.dao.model.Category;
import com.example.marketplace.dao.repositories.BuyerRepository;
import com.example.marketplace.dao.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public Buyer createBuyer() {
        return buyerRepository.save(generateBuyer());
    }

    public Buyer findBuyerById(Long id) {
        return buyerRepository.findById(id).orElseThrow();
    }

    private Buyer generateBuyer() {
        Buyer buyer = new Buyer();
        buyer.setLogin("ilya_molostvov");
        buyer.setPassword("codeforcesTOP");
        buyer.setNickname("1700_na_CF");
        Set<Category> prefs = new HashSet<>();
        prefs.add(categoryRepository.findById(1L).orElseThrow());
        buyer.setPreferences(prefs);
        return buyer;
    }
}