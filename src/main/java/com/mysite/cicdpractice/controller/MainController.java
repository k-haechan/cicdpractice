package com.mysite.cicdpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping
	public String index() {
		return "Hello, World! this is 수정본";
	}
	@GetMapping("/health")
	public String health() {
		return "OK";
	}
	@GetMapping("/version")
	public String version() {
		return "1.0.0";
	}
	@GetMapping("/status")
	public String status() {
		return "Service is runni";
	}

	@GetMapping("/info")
	public String info() {
		return "This is a simple Spring Boot application for CI/CD practice.";
	}
	@GetMapping("/greet")
	public String greet() {
		return "Greetings from the CI/CD practice application!";
	}
}
