package com.mission36.mappings.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mission36.mappings.entity.Cart;
import com.mission36.mappings.entity.Item;
import com.mission36.mappings.service.CartService;
import com.mission36.mappings.service.ItemsService;

@RestController
public class MappingsRestController {

	@Autowired
	private CartService cartService;

	@Autowired
	private ItemsService itemService;

	@PostMapping("savecart")
	public Cart saveCart() {
		
		Cart cart = new Cart();
		cart.setName("metro cart: ");
		
		Item item1 = new Item();
		item1.setName("chacos..");
		item1.setCart(cart);
		
		Item item2 = new Item();
		item2.setName("oats..");
		item2.setCart(cart);
		
		cart.getItems().add(item1);
		cart.getItems().add(item2);
		
		return cartService.saveCart(cart);
	}
}
