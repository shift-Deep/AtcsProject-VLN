package com.Service;

import org.springframework.stereotype.Service;

import com.UserLogin.model.UserModel;
import com.repositary.UserRepositary;

@Service
public class UserService {

	private UserRepositary userRepositary;
	
	
	
	public UserService(UserRepositary userRepositary) {
		this.userRepositary = userRepositary;
	}



	public UserModel registerUser(String login, String password, String email) {
		if(login !=null && password !=null)
		{
			return null;
		}
		else
		{
			UserModel userModel = new UserModel();
			userModel.setLogin(login);
			userModel.setPassword(password);
			userModel.setEmail(email);
			return userRepositary.save(userModel);
			
		}
		
	}
	
	public UserModel authenticate(String login, String password) {
		return userRepositary.findByLoginAndPasswordOptional(login, password).orElse(null);
	}
	
	
}
 