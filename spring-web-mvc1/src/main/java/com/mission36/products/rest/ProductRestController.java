package com.mission36.products.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mission36.entity.Product;
import com.mission36.service.ProductService;

@RestController
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/allproduct")
	public List<Product> getAllProducts(){
		return productService.getAllProduct();
	}

}
