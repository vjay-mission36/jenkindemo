package com.mission36.one2one.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import com.mission36.one2one.entity.User;

@Entity
@Table(name = "adress")
public class UserAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	private String address1;

	@OneToOne(mappedBy = "userAddress")
	private User user;

	public Long getId() {
		return Id;
	}

	public String getAddress1() {
		return address1;
	}

	public User getUser() {
		return user;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
