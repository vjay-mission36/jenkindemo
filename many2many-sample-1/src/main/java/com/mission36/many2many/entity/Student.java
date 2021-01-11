package com.mission36.many2many.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "student_cource",
	           joinColumns = {@JoinColumn(name="student_id")},
	           inverseJoinColumns = {@JoinColumn(name="cource_id")}
	          )
	private Set<Cource> cources = new HashSet<>();
	
	@OneToMany(mappedBy = "student")
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

	public Set<Cource> getCources() {
		return cources;
	}

	public void setCources(Set<Cource> cources) {
		this.cources = cources;
	}

	
}
