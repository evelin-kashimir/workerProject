package io.github.evelinferraz.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {	
	/*
	 * Cria uma instancia unica de RestTemplate, 
	 * que será responsável por fazer uma chamada 
	 * a um microserviço externo quando injetada em 
	 * uma classe.
	*/
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
