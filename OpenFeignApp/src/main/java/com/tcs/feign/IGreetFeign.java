package com.tcs.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREETSERVICE")
public interface IGreetFeign {

	@GetMapping("/greet/api/")
	public String getGreet();

}
