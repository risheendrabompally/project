package com.petcare.Puppies_creation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PuppiesCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuppiesCreationApplication.class, args);
	}
}
