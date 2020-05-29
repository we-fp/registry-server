package com.rs.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class RegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryServerApplication.class, args);
	}

}
