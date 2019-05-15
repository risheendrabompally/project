package com.petcare.GetPuppies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GetPuppiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetPuppiesApplication.class, args);
	}

}
