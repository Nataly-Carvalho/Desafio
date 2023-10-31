package com.generation.cadastroAlunos.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI springBlogPessoalOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Desafio Generation Nataly Carvalho")
						.description("Desafio Generation")
						.version("V0.0.1")
				.license(new License()
						.name("Nataly Carvalho")
						.url("https://github.com/Nataly-Carvalho/Desafio-Gen"))
				.contact(new Contact()
						.name("Repositorio do desafio")
						.url("https://github.com/Nataly-Carvalho/Desafio-Gen")
						.email("natalycarvalho.dev@gmail.com")))
				.externalDocs(new ExternalDocumentation()
						.description("GitHub")
						.url("https://github.com/Nataly-Carvalho/Desafio-Gen"));
	}

}
