package com.petcare.demo.OwnerLogin.loginrepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.petcare.demo.OwnerLogin.model.OwnerPojo;

public interface OwnerLoginRepo extends MongoRepository<OwnerPojo, String>{

}
