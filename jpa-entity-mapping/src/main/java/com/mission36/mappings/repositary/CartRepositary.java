package com.mission36.mappings.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mission36.mappings.entity.Cart;

@Repository
public interface CartRepositary extends JpaRepository<Cart, Long>{

}
