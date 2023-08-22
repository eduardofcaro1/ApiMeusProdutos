package com.usd.ApiMeusProdutos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.usd.ApiMeusProdutos.model")
public class ApiMeusProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMeusProdutosApplication.class, args);
	}

}
