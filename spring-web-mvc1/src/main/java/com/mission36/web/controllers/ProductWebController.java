package com.mission36.web.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mission36.entity.Product;
import com.mission36.service.ProductService;

@Controller
public class ProductWebController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("welcome", "welcome to Test");
		return "index";
	}

	@RequestMapping("/allproducts")
	public String allProducts(Map<String, Object> model) {
		System.out.println(" Size of product list: " + productService.getAllProduct().size());
		model.put("products", productService.getAllProduct());
		model.put("mode", "PROD_VIEW");
		return "allproducts";
	}

	@RequestMapping("/editproduct")
	public String editProduct(@RequestParam String id, Map<String, Object> model) {

		int prodId = Integer.parseInt(id);
		model.put("mode", "PROD_EDIT");
		model.put("product", productService.getProductById(prodId));
		return "allproducts";
	}

	@PostMapping("/saveproduct")
	public String saveProduct(@ModelAttribute Product product, Map<String, Object> model) {
		productService.saveProduct(product);
		model.put("products", productService.getAllProduct());
		model.put("mode", "PROD_VIEW");
		return "allproducts";
	}

}
