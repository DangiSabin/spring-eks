package com.learning.spring_eks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringEksController {
	@GetMapping("/health")
	public String healthCheck() {
		return "Spring EKS App is running...";
	}
}
