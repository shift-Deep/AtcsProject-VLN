package com.VLM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VLM.Entity.User;
import com.VLM.repository.UserRepository;


@Service
public class UserServiceImpl  {
	
	@Autowired
	private UserRepository userrepository;
	
	public  User registerUser(User user) {
		
		return userrepository.save(user);
	
	}
	
	public User login(String email, String password) {

		return userrepository.findByEmailAndPassword(email, password);
	}

}
