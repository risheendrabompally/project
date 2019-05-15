package com.petcare.register.OwnerRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petcare.register.OwnerRegistration.model.OwnerPojo;
import com.petcare.register.OwnerRegistration.registerrepo.OwnerRegistrationRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class OwnerController {


	@Autowired
	OwnerRegistrationRepo ownerrepo;
	
	@PostMapping("/owner/register")
	public OwnerPojo postOwner(@RequestBody OwnerPojo customer) {

	  OwnerPojo _customer = ownerrepo.save(new OwnerPojo(customer.getFullname(),customer.getEmail(),customer.getPassword(),customer.getRepeatpassword()));
		return _customer;
	}
}
