package com.example.Service_A.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceAController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/show")
	public String show() {
		
		return "<b>This is Show Method of first service</b>";
	}
	
	@RequestMapping("/payment")
	public String payment() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8082/action", String.class);
		String res = response.getBody();
		return "<b>"+res+"</b>";
	}
}
