package com.VLM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	
	
	@GetMapping("/")
	public String hello()
	{
		return "Server is Working";
	}

}
