package com.VLM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/home")
	public String home() {
		return "register_page.html";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login_page.html";
	}
	
	
}
