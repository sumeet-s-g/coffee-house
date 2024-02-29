package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CafeController {
	
	@GetMapping("/")
	public String getView() {
		return "CafeLogin";
	}
	
	@PostMapping("/home") 
	public String userLogined(@RequestParam("userName") String name, @RequestParam("userEmail") String email, Model model) {
				
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		return "CafeHome";
	}
	
	@PostMapping("/ordered") 
	public String userOrdered(@RequestParam("orderItems") String orders, Model model) {
				
		model.addAttribute("orderList", orders);
		return "ThankYouPage";
	}
	
}
