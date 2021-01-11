package com.mission36.mappings.entity;

import javax.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/*
 * Every cart can have multiple Items
 * one to to many item
 * but it is always birectional 
 * one entity should be owner
 * IT IS NOT OWNING THE RELATIONSHIP
 */

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	private String name;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cart")
	private Set<Item> items = new HashSet<>();

}
