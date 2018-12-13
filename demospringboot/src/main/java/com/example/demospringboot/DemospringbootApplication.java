package com.example.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemospringbootApplication {

	@RequestMapping("/")
	String hello() {
		return "Hello Spring Boot Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootApplication.class, args);
	}

}
