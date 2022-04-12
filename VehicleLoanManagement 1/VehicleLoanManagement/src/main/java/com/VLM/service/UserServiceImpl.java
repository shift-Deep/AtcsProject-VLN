package com.VLM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VLM.Entity.User;
import com.VLM.repository.UserRepository;


@Service
public class UserServiceImpl  {
	
	@Autowired
	private UserRepository userrepository;
	
	public  User registerUser(User user) {
		
		return userrepository.save(user);
	
	}
	
	public User login(String email, String password) {

		return userrepository.findByEmailAndPassword(email, password);
	}
	
	public User update(User user, Integer userId) {
		
		
			User ul =userrepository.findById(userId).get();
			ul.setAadhar(user.getAadhar());
			ul.setAddress(user.getAddress());
			ul.setCity(user.getCity());
			ul.setEmptype(user.getEmptype());
			ul.setPan(user.getPan());
			ul.setPin(user.getPin());
			ul.setSalary(user.getSalary());
			ul.setState(user.getState());
			
		
		return userrepository.save(ul); 
		
	}
	public List<User> getAllUsers(){
		return userrepository.findAll();
	}
	

}
