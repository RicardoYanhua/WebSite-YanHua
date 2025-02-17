package com.yanhua.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebClientController {
	
	@GetMapping("")
	public String CargarMainTemplate1() {
		return "/WebPages/Inicio";
	}
	@GetMapping("/")
	public String CargarMainTemplate2() {
		return "/WebPages/Inicio";
	}
	
	@GetMapping("/Inicio")
	public String CargarMainTemplate3() {
		return "/WebPages/Inicio";
	}
	
}
