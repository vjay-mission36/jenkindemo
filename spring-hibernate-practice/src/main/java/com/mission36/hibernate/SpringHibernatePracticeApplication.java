package com.mission36.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mission36.hibernate.entity.Person;
import com.mission36.hibernate.entity.PhoneNumber;
import com.mission36.hibernate.service.PersonService;
import com.mission36.hibernate.service.PhoneNumberService;

@SpringBootApplication
public class SpringHibernatePracticeApplication {

	@Autowired
	public PersonService personService;
	
	@Autowired
	public static PhoneNumberService phoneNumberService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHibernatePracticeApplication.class, args);
        Person p = new Person();
        p.setName("vijay");
        
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setPhoneNumber("9494297254");
        phoneNumber.setPerson(p);
        
       PhoneNumber phone =  phoneNumberService.savePhoneNUmber(phoneNumber);
       System.out.println(phone.getPhoneNumber()+ " saved....");
        
	}

}
