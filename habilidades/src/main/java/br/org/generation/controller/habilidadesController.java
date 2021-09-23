package br.org.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class habilidadesController {

	@RestController
	@RequestMapping("/habilidades")
    public class persitencia {
	  	
			
		    @GetMapping
			public String mostrarhabilidade() {
				return "persistencia";

		}
	}
}

		
