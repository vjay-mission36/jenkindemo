package com.mission36.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PHONE")
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "phone_number")
	private String phoneNumber;

	@ManyToOne
	@JoinColumn(name = "person_id", foreignKey = @ForeignKey(name = "PERSON_ID_FK"))
	private Person person;

	public Long getId() {
		return id;
	}

	

	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public Person getPerson() {
		return person;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public void setPerson(Person person) {
		this.person = person;
	}

}
