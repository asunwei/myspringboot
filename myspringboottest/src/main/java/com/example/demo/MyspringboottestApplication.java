package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MyspringboottestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringboottestApplication.class, args);
	}
	
	 @GetMapping("/api/hello")
	    public String hello() {
	        return "Hello From Spring Boot";
	    }
}
