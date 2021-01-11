package com.mission36.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.mappings.entity.Address;
import com.mission36.mappings.repositary.AddressRepositary;

@Service
public class AddressService {
  
	@Autowired
	private AddressRepositary addressRepositary;
	
	public Address saveAddress(Address address) {
		return addressRepositary.save(address);
	}
}
