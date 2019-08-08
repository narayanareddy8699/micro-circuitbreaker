package com.narayan.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication(scanBasePackages = { "com" })
@EnableCircuitBreaker
public class ToReadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToReadApplication.class, args);
	}

}
