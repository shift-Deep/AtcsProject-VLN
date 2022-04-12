package com.VLM.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public  ResponseEntity<String> registerUser(@Valid User user) {
		
			userservice.registerUser(user);
			return new ResponseEntity<>("User Registration Successful!!",HttpStatus.OK);
	}
	@GetMapping("/login")
	public ResponseEntity<String> Login(String email,String password) {
		
		User u= userservice.login(email,password);
		ResponseEntity<String> r;
		
		if(u!=null)
		{
			r= new ResponseEntity<>("Login Successful!!",HttpStatus.OK);
		
		}
		else
		{
			r= new ResponseEntity<>("Oops Username or Password incorrect!!",HttpStatus.OK);
		}
		
		return r;
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateUser( @RequestBody User user,@RequestParam Integer userId){
		userservice.update(user, userId);
		return new ResponseEntity<>("Updation Successful!!",HttpStatus.OK);
	}
}
