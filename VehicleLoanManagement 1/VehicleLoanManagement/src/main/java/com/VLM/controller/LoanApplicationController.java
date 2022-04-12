package com.VLM.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.VLM.Entity.LoanApplication;
import com.VLM.Entity.User;
import com.VLM.repository.UserRepository;
import com.VLM.service.LoanServiceImpl;

	@RestController
	public class LoanApplicationController {
	
	@Autowired
	LoanServiceImpl loanservice ;
	
	@Autowired
	UserRepository us;
	
	@PostMapping("/applyloan")
	public ResponseEntity<String> applyLoan(@RequestParam Integer userId, @Valid @RequestBody LoanApplication application) {
		User user =us.findById(userId).get();
		if(user.getAadhar()==null || user.getAddress() == null || user.getCity()==null || user.getEmptype()==null
				|| user.getPan()==null || user.getPin()==null||user.getSalary()==null|| user.getState()==null) {
			return new ResponseEntity<>("Please enter all details in user details and try again", HttpStatus.BAD_REQUEST); 
		}
		 loanservice.applyLoan(application,userId);
		 return new ResponseEntity<>("Loan Application is submitted!", HttpStatus.OK);
		
	}
	@GetMapping("/GetAllApplication")
	public List<LoanApplication> getAll() {
		return loanservice.getall();
	}
	
	@GetMapping("/GetApproved")
	public List<LoanApplication> getApproved() {
		
		return loanservice.getApproved("Approved");
	
	}
	
	@GetMapping("/GetPending")
	public List<LoanApplication> getPending() {
		
		return loanservice.getApproved("PENDING");
	
	}
	
	

}
