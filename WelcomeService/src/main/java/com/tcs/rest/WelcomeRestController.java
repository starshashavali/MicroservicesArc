package com.tcs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.feign.IGreetFeign;

@RestController
@RequestMapping("/welcome/api")
public class WelcomeRestController {
	
	
@Autowired
private IGreetFeign greetFeign;

@GetMapping("/")
public  String getWel() {
	return greetFeign.getGreet();
}

}
