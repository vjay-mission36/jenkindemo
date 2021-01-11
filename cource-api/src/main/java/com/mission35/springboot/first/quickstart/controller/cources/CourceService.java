package com.mission35.springboot.first.quickstart.controller.cources;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourceService {
	
	
  public CourceService() {
		super();
		// TODO Auto-generated constructor stub
	}

private List<Cource> cources =  Arrays.asList(
		  new Cource("Sprigboot", "spring boot", "springboot"),
		  new Cource("artificialint", "artificialint", "artificialint"),
		  new Cource("datascience", "datascience", "datascience")
		  );
  
  public List<Cource> getAllCources(){
	  return cources;
  }
  
  public Cource getCource(String name) {
	  System.out.println("Name: "+name);
	  Cource c =  cources.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	  System.out.println(c);
	  return c;
  }
}
