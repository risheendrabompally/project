package com.petcare.register.BorrowerRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.petcare.register.BorrowerRegistration.model.BorrowerPojo;
import com.petcare.register.BorrowerRegistration.registerrepo.BorrowerRegistrationRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BorrowerController {

	@Autowired
	BorrowerRegistrationRepo BorrowerPojo;
	
	 @PostMapping("/borrower/register")
		public BorrowerPojo postOwner(@RequestBody BorrowerPojo customer) {

		 BorrowerPojo _customer = BorrowerPojo.save(new BorrowerPojo(customer.getFullname(),customer.getEmail(),customer.getPassword(),customer.getRepeatpassword()));
			return _customer;
		}
}
