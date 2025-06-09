package com.mysite.cicdpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping
	public String index() {
		return "Hello, World!";
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
}
