package com.meli.desafio_final.repository;

import com.meli.desafio_final.model.SellerAd;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISellerAdRepo extends JpaRepository<SellerAd, Long> {
}