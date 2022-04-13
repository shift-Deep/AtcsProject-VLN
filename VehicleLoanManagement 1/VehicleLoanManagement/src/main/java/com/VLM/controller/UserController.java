package com.VLM.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.VLM.Entity.User;
import com.VLM.service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	UserServiceImpl userservice;
	
	@PostMapping("/register")
	public  String registerUser(@Valid User user) {
		
			userservice.registerUser(user);
			//return new ResponseEntity<>("User Registration Successful!!",HttpStatus.OK);
			return "redirect:/loginUser";
	}
	@GetMapping("/login")
	public String Login(String email,String password) {
		
		User u= userservice.login(email,password);
		ResponseEntity<String> r;
		
		if(u!=null)
		{
			
			//r= new ResponseEntity<>("Login Successful!!",HttpStatus.OK);
			return "redirect:/userOptions";
		}
		else
		{
			//r= new ResponseEntity<>("Oops Username or Password incorrect!!",HttpStatus.OK);
			return "redirect:/loginError";
		}
		
	
	}
	@PostMapping("/update")
	public ResponseEntity<String> updateUser(User user,Integer userId){
		userservice.update(user, userId);
		return new ResponseEntity<>("Updation Successful!!",HttpStatus.OK);
	}
}
