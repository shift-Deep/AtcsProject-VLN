package com.VLM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/index")
	public String index() {
		return "index.html";
	}
	@RequestMapping("/home")
	public String home() {
		return "register_page.html";
	}
	
	@RequestMapping("/loginUser")
	public String login() {
		return "login_page.html";
	}
	
	@RequestMapping("/loan")
	public String loan() {
		return "loanDetails_page.html";
	}
	
	@RequestMapping("/admin")
	public String AdminLogin() {
		return "admin_login.html";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser() {
		return "update_details.html";
	}
	
	@RequestMapping("/userOptions")
	public String userOptions() {
		return "userOption.html";
	}
	
	@RequestMapping("/adminPortal")
	public String adminPortal() {
		return "adminPortal.html";
	}
	
	@RequestMapping("/loginError")
	public String loginError() {
		return "loginError.html";
	}
	
	
}
