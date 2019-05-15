package com.petcare.login.BorrowerLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BorrowerLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(BorrowerLoginApplication.class, args);
	}

}
