package com.petcare.demo.OwnerLogin.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.petcare.demo.OwnerLogin.loginrepository.OwnerLoginRepo;
import com.petcare.demo.OwnerLogin.model.OwnerPojo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class OwnerController {

	@Autowired
	OwnerLoginRepo ownerrepo;

	
	@PostMapping("/owner/validate")
	OwnerPojo validateOwner(@RequestBody OwnerPojo userlog) {

	//System.out.println(userlog);
		List<OwnerPojo> login=ownerrepo.findAll();
		//System.out.println(login);
	//	System.out.println(login);
		for(OwnerPojo log:login) {
			//System.out.println(dblog.getEmail()+" "+userlog.getEmail());
			if(log.getEmail().equals(userlog.getEmail()) && log.getPassword().equals(userlog.getPassword()))
				return log;
		    }
		
		return null;
	}
}	
