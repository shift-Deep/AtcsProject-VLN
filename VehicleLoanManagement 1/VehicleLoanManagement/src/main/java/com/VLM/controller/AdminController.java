package com.VLM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.VLM.Entity.Admin;
import com.VLM.Entity.LoanApplication;
import com.VLM.Entity.User;
import com.VLM.service.AdminServiceImpl;
import com.VLM.service.UserServiceImpl;

@Controller
public class AdminController {
	
	@Autowired
	AdminServiceImpl adminservice;
	
	@Autowired
	UserServiceImpl uservice;
	
	@PostMapping("/admin/cred")
	public ResponseEntity<String> cred(@RequestBody Admin admin) {
		
		 adminservice.cred(admin);
		 return new ResponseEntity<>("Admin is added to Database!",HttpStatus.OK);
	}
	
	@GetMapping("admin/login")
	public String Login(@RequestParam String username,@RequestParam String password){
		
		 Admin a= adminservice.login(username, password);
		 ResponseEntity<String> r;
		 
		 if(a!=null)
			{
				//r= new ResponseEntity<>("Login Successful!!",HttpStatus.OK);
			 return "redirect:/adminPortal";
			}
			else
			{
				//r= new ResponseEntity<>("Oops Username or Password incorrect!!",HttpStatus.OK);
			return "redirect:/loginError";
			}
			
		 
	}
	@GetMapping("/admin/status")
	public List<?> status (){
		
		return adminservice.status();
	}
	
	@PostMapping("/admin/approval")
	public LoanApplication approval(@RequestParam Integer appId) {
		return adminservice.approval(appId);
	}
	
	@PutMapping("/admin/update")
	public Admin update(@RequestParam String username, @RequestParam String password) {
		
		return adminservice.update(username, password);
	}
	
	@GetMapping("/GetAllUsers")
	public List<User> getAllUsers(){
		return uservice.getAllUsers();
	}

}
