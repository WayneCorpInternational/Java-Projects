package com.generation.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")

public class HelloController {

	@GetMapping
	public String HelloWorld() {
		return "Hello World, ola galerinha do YouTube\n A minha habilidade usada nessa atividade foi a persistencia, e o trabalho em equipe em conjunto com a minha cole de classe Joice S2";
		
		
				
	}
}
