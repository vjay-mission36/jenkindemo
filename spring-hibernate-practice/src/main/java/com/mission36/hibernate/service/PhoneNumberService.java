package com.mission36.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.hibernate.entity.PhoneNumber;
import com.mission36.hibernate.repo.PhoneNumberRepositary;

@Service
public class PhoneNumberService {

	@Autowired
	private PhoneNumberRepositary phoneNumberRepositary;
	
	public PhoneNumber savePhoneNUmber(PhoneNumber phoneNUmber) {
		return phoneNumberRepositary.save(phoneNUmber);
	}
}
