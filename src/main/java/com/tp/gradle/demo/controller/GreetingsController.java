package com.tp.gradle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class GreetingsController{
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from GreetingsController";
	}
	
}