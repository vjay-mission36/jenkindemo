package com.mission36.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.mappings.entity.User;
import com.mission36.mappings.repositary.UserRepositary;

@Service
public class UserService {
	
	@Autowired
	private UserRepositary userRepositary;
	
	
	public User saveUser(User user) {
		return userRepositary.save(user);
	}
}
