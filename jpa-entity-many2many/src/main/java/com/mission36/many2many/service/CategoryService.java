package com.mission36.many2many.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.many2many.model.Category;
import com.mission36.many2many.repositary.CategoryRepositary;

@Service
public class CategoryService {
  
	@Autowired
	private CategoryRepositary categoryRepositary;
	
	public Category saveCategory(Category category) {
		return categoryRepositary.save(category);
	}
	
	public Category getCategoryById(Long id) {
		return categoryRepositary.findById(id).get();
	}
}
