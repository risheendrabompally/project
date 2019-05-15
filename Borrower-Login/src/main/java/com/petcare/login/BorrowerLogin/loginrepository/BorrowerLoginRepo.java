package com.petcare.login.BorrowerLogin.loginrepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.petcare.login.BorrowerLogin.model.BorrowerPojo;

public interface BorrowerLoginRepo extends MongoRepository<BorrowerPojo, String>{

}
