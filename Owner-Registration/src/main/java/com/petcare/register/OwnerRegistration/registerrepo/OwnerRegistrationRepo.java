package com.petcare.register.OwnerRegistration.registerrepo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.petcare.register.OwnerRegistration.model.OwnerPojo;

@Repository
public interface OwnerRegistrationRepo extends MongoRepository<OwnerPojo, String>{

}
