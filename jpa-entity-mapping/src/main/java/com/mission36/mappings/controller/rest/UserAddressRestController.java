package com.mission36.mappings.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mission36.mappings.entity.Address;
import com.mission36.mappings.entity.User;
import com.mission36.mappings.service.AddressService;
import com.mission36.mappings.service.UserService;

@RestController
public class UserAddressRestController {
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AddressService addressService;
	
	
	@PostMapping("adduseraddress")
	public User addUserWithAddress() {
		User user = new User();
		Address address = new Address();
		
		user.setName("raja sekhar");
		address.setLine1("mig");
		address.setLine2("KPHB");
		address.setLine3("telanga");
		
		user.setAddress(address);
		
		return userService.saveUser(user);
	}

}
	