package com.example.marketplace.dao.repositories;

import com.example.marketplace.dao.model.Seller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Long> {}
