package com.decathlon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DecathlonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecathlonApplication.class, args);
	}
}
