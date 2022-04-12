package com.VLM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VLM.Entity.LoanApplication;
import com.VLM.repository.LoanRepository;

@Service
public class LoanServiceImpl  {
	
	@Autowired
	LoanRepository loanrepo;
	
	public LoanApplication applyLoan(LoanApplication application, Integer userId) {
		
		LoanApplication l=loanrepo.save(application);
		Integer appId= l.getApplicationId();
		l= loanrepo.findById(appId).get();
		l.setUserId(userId);
		return  loanrepo.save(l);
//		LoanApplication l= new LoanApplication();
//		l.setUserId(userId);
//		l.setAppdate(application.getAppdate());
//		l.setBrand(application.getBrand());
//		l.setChassisNo(application.getChassisNo());
//		l.setColour(application.getColour());
//		l.setExistingEMI(application.getExistingEMI());
//		l.setAmount(application.getAmount());
	}
	public List<LoanApplication> getall() {
		return loanrepo.findAll();
	}
	public List<LoanApplication> getApproved(String status){
		return loanrepo.findByStatus(status);
	}

}
