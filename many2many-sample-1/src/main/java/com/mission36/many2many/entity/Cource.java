package com.mission36.many2many.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Cource {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "cources")
	private Set<Student> students = new HashSet<>(); 
	
	@OneToMany(mappedBy = "cource")
	private Set<CourceRating> ratings = new HashSet<CourceRating>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
