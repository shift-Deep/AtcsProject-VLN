package com.VLM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.VLM.Entity.Admin;
import com.VLM.Entity.LoanApplication;
import com.VLM.service.AdminServiceImpl;

@RestController
public class AdminController {
	
	@Autowired
	AdminServiceImpl adminservice;
	
	@PostMapping("/admin/cred")
	public Admin cred(@RequestBody Admin admin) {
		
		return adminservice.cred(admin);	
	}
	
	@GetMapping("admin/login")
	public Admin Login(@RequestParam String username,@RequestParam String password){
		
		return adminservice.login(username, password);
	}
	@GetMapping("/admin/status")
	public List<?> status (){
		
		return adminservice.status();
	}
	
	@PostMapping("/admin/approval")
	public LoanApplication approval(@RequestParam Integer userId) {
		return adminservice.approval(userId);
	}
	

}
