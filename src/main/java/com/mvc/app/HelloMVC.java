package com.mvc.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMVC {

	@RequestMapping("/hello")
	public String run() {
		return "Welcome to Spring Boot application";
	}
}
