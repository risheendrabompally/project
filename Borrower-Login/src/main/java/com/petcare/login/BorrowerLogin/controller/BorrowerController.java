package com.petcare.login.BorrowerLogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.petcare.login.BorrowerLogin.loginrepository.BorrowerLoginRepo;
import com.petcare.login.BorrowerLogin.model.BorrowerPojo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BorrowerController {
	@Autowired
	BorrowerLoginRepo borrowrepo;

	
	@PostMapping("/borrower/validate")
	BorrowerPojo validateOwner(@RequestBody BorrowerPojo userlog) {

	//System.out.println(userlog);
		List<BorrowerPojo> login=borrowrepo.findAll();
		//System.out.println(login);
	//	System.out.println(login);
		for(BorrowerPojo log:login) {
			//System.out.println(dblog.getEmail()+" "+userlog.getEmail());
			if(log.getEmail().equals(userlog.getEmail()) && log.getPassword().equals(userlog.getPassword()))
				return log;
		    }
		
		return null;
	}
}	