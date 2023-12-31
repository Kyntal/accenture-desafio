package com.desafio.desafioaccenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(mode = AdviceMode.PROXY)
public class DesafioaccentureApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioaccentureApplication.class, args);
	}

}
