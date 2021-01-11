package com.mission36.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.mappings.entity.Cart;
import com.mission36.mappings.repositary.CartRepositary;

@Service
public class CartService {

	  @Autowired
	  private CartRepositary cartService;
	  
	  
	  public Cart saveCart(Cart cart) {
		  return cartService.save(cart);
	  }
}
