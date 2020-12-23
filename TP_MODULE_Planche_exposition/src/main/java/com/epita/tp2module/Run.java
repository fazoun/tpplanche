package com.epita.tp2module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class Run {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Run.class, args);
		
	}
}
