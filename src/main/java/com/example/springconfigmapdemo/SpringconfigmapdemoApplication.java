package com.example.springconfigmapdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringconfigmapdemoApplication {
	
	@Autowired
	private Configurations config;

	public static void main(String[] args) {
		SpringApplication.run(SpringconfigmapdemoApplication.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		return "Message: "+ config.getMessage() + "  \nSource:" + config.getSource();
	}
	
}
