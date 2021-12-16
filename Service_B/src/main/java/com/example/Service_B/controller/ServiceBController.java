package com.example.Service_B.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {
	
	@RequestMapping("/action")
	public String show() {
		
		return "<b>Your Payment has been done.</b>";
	}

}
