package com.petcare.register.BorrowerRegistration.registerrepo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.petcare.register.BorrowerRegistration.model.BorrowerPojo;


@Repository
public interface BorrowerRegistrationRepo extends MongoRepository<BorrowerPojo, String>{

}
