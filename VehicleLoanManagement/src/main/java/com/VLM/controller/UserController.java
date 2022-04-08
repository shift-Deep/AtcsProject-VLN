package com.VLM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.VLM.Entity.User;
import com.VLM.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl userservice;
	
	@PostMapping("/register")
	public User registerUser( @RequestBody User user) {
		
		return userservice.registerUser(user);
		
	}
	@GetMapping("/login")
	public User Login(@RequestParam String email,@RequestParam String password) {
		return userservice.login(email,password);
	}
	

}
