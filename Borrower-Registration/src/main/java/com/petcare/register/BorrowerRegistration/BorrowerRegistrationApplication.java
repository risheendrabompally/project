package com.petcare.register.BorrowerRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BorrowerRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BorrowerRegistrationApplication.class, args);
	}

}
