package com.VLM.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<String> applyLoan(@RequestParam Integer userId, @Valid @RequestBody LoanApplication application) {
		
		 loanservice.applyLoan(application,userId);
		 return new ResponseEntity<>("Loan Application is submitted!", HttpStatus.OK);
		
	}
	

}
