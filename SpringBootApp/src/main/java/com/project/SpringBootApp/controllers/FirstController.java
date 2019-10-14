package com.project.SpringBootApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping("/hola")
	public String hello() {
		return "Hola Mundo";
	}
}
