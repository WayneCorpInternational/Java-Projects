package com.helo.helo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Hello word")
@SpringBootApplication
public class HelloWordController {
@GetMapping("/Hello word")

public String sayHello() {
return "Hello World! Nosso primeiro projeto Spring Boot";
	}
		
}
