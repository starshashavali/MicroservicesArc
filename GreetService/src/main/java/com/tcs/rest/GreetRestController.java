package com.tcs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet/api")
public class GreetRestController {
	
	@GetMapping("/")
	public String getGreet() {
		return "Welcome to arunachalasiva...";
	}

}
