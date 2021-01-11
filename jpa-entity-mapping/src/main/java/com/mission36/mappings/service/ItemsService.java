package com.mission36.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.mappings.entity.Item;
import com.mission36.mappings.repositary.ItemsRepositary;

@Service
public class ItemsService {
   
	@Autowired
	private ItemsRepositary itemsRepositary;
	
	public Item saveItem(Item item) {
		return itemsRepositary.save(item);
	}
}
