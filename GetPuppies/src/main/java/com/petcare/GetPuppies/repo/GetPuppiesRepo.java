package com.petcare.GetPuppies.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.petcare.GetPuppies.Model.PuppyPojo;

public interface GetPuppiesRepo extends  MongoRepository<PuppyPojo, String>{

}
