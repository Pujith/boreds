package com.bored.cave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bored")
public class BoredController {
	
	@GetMapping(value="/one")
	public String boredMain() {
		return "Yup, bored";
	}

}
