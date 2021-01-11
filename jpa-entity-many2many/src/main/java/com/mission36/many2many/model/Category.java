package com.mission36.many2many.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "cat_name")
	private String name;

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

	/*
	 * public Set<Parent> getParents() { return parents; }
	 * 
	 * public void setParents(Set<Parent> parents) { this.parents = parents; }
	 * 
	 * public Set<Child> getChildren() { return children; }
	 * 
	 * public void setChildren(Set<Child> children) { this.children = children; }
	 */
    
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cat_child_id", referencedColumnName = "id")
	// private Set<Parent> parents = new HashSet<Parent>();
	private Set<Category> parents = new HashSet<>();

    
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cat_prnt_id", referencedColumnName = "id")
	private Set<Category> children = new HashSet<Category>();

	public Set<Category> getParents() {
		return parents;
	}

	public Set<Category> getChildren() {
		return children;
	}

	public void setParents(Set<Category> parents) {
		this.parents = parents;
	}

	public void setChildren(Set<Category> children) {
		this.children = children;
	}

}
