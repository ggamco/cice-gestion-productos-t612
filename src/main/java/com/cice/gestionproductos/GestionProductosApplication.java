package com.cice.gestionproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GestionProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionProductosApplication.class, args);
	}

}
