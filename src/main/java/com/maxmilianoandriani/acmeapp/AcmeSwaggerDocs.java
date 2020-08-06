package com.maxmilianoandriani.acmeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AcmeSwaggerDocs {
	
	public static void main(String[] args) {
		SpringApplication.run(AcmeSwaggerDocs.class, args);
	}

	@Bean
	public springfox.documentation.spring.web.plugins.Docket docket() {
		Docket docket = new Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2);
		return docket.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		@SuppressWarnings("deprecation")
		ApiInfo apiInfo = new ApiInfo("Acme Producer (AP) REST API", "Lista de serviços da empresa AP para integração", "Versão API 1.0",
				"Termos de uso", "aluno@e-mail.com", "MIT", "https://github.com/maxandriani/igti-soa-acme-app/blob/master/LICENSE");
		return apiInfo;
	}
	
}
