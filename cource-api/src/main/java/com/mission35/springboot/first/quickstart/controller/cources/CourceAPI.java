package com.mission35.springboot.first.quickstart.controller.cources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourceAPI {
	 
	@Autowired
	 private CourceService courcesService;
	
	 @RequestMapping("/cources")
	  public List<Cource> getAllCources(){
		  return courcesService.getAllCources();
	  }
	 
	 @RequestMapping("cources/{name}")
	 public Cource getCourceByName(@PathVariable("name")  String name) {
		 return courcesService.getCource(name);
	 }
	 
	 
}
