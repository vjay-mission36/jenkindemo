package com.mission36.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.hibernate.entity.Person;
import com.mission36.hibernate.repo.PersonRepositary;

@Service
public class PersonService {

	@Autowired
	private PersonRepositary personRepositary;

	public Person savePerson(Person p) {
		return personRepositary.save(p);
	}
	
	

}
