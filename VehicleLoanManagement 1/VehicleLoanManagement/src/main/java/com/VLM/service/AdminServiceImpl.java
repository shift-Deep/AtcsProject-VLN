package com.VLM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VLM.Entity.Admin;
import com.VLM.Entity.LoanApplication;
import com.VLM.Entity.User;
import com.VLM.repository.AdminRepository;
import com.VLM.repository.LoanRepository;
import com.VLM.repository.UserRepository;

@Service
public class AdminServiceImpl {
	
	@Autowired
	UserRepository userrepo;
	
	@Autowired
	AdminRepository adminrepo;
	
	@Autowired
	LoanRepository loanrepo;
	
	public List<User> status() {
	
		return userrepo.findAll();
	}

	public LoanApplication approval(Integer appId) {
		
		LoanApplication l = loanrepo.findById(appId).get();
		l.setStatus("Approved");
		loanrepo.save(l);
		return l;
	}

	public Admin cred(Admin admin) {
		
		return adminrepo.save(admin);
	}

	public Admin login(String username, String password) {
		
//		return adminrepo.authentication(username, password);
		return adminrepo.findByUsernameAndPassword(username, password);
	}
	
	public Admin update(String username, String password) {
		
		Admin a = adminrepo.findByUsername(username);
		
		a.setPassword(password);
		adminrepo.save(a);
	
		return a;
		
	}

}
