package com.mission36.many2many.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mission36.many2many.model.Category;
import com.mission36.many2many.model.Child;
import com.mission36.many2many.model.Parent;
import com.mission36.many2many.service.CategoryService;

@RestController
public class CategoryRestController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("savecategory")
	public Category saveCategory() {
		
		Category catgory = new Category();
		
		catgory.setName("main category");
		
		Category parentCategory = new Category();
		parentCategory.setName("first parent category");
		catgory.getParents().add(parentCategory);
		
		parentCategory = new Category();
		parentCategory.setName("second parent category");
		catgory.getParents().add(parentCategory);
		
		
		Category childCategory = new Category();
		childCategory.setName("first child category");
		catgory.getChildren().add(childCategory);
		
		Category secondParentCat = new Category();
		secondParentCat.setName("second parent..");
		childCategory.getParents().add(secondParentCat);
		
		
		childCategory = new Category();
		childCategory.setName("Second child category");
		catgory.getChildren().add(childCategory);
		
		return categoryService.saveCategory(catgory);
		
	}
	
	@GetMapping("category")
	public Category getCategory(@RequestParam Long id) {
		return categoryService.getCategoryById(id);
	}
}
