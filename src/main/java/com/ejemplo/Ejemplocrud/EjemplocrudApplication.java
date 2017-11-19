package com.ejemplo.Ejemplocrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages="com.ejemplo.dominio")
@ComponentScan("com.ejemplo.restservice")
@SpringBootApplication
public class EjemplocrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemplocrudApplication.class, args);
	}
}
