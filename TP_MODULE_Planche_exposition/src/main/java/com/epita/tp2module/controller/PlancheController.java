package com.epita.tp2module.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epita.tp2module.service.PlancheService;

@RestController
public class PlancheController {

	@Autowired
	PlancheService service;

	@PostMapping("/surface/{surface}")
	public void surface(@PathVariable double surface) {
		service.calculerPlancheSurface(surface); 
		
	}

}
