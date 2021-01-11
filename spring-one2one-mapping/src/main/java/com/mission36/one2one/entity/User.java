package com.mission36.one2one.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "user_name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private UserAddress userAddress;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public UserAddress getUserAddress() {
		return userAddress;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
	
	
}
