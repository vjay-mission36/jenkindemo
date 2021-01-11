package com.mission36.repository;

import java.util.Currency;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mission36.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public Iterable<Product> findByPrices(Currency currency);
}
