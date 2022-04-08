package com.VLM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.VLM.Entity.LoanApplication;
import com.VLM.service.LoanServiceImpl;

	@RestController
	public class LoanApplicationController {
	
	@Autowired
	LoanServiceImpl loanservice ;
	
	@PostMapping("/applyloan")
	public LoanApplication applyLoan(@RequestParam Integer userId, @RequestBody LoanApplication application) {
		
		return loanservice.applyLoan(application,userId);
		
	}
	

}
