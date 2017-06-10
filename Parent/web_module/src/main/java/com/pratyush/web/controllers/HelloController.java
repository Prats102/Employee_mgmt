package com.pratyush.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pratyush.service.Service;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	Service service;
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String welcome(Model model) {
		System.out.println("Say Hi::::");
		service.serviceTest();
		System.out.println("tttttt");
		model.addAttribute("message", "This is Welcome message");
		return "welcome";
	}
	@RequestMapping(method=RequestMethod.GET)
	public String sayHello(Model model) {
		System.out.println("Say Hello::::");
		model.addAttribute("message", "This is Welcome message");
		return "welcome";
	}
}
