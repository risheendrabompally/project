package com.petcare.Puppies_creation.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.petcare.Puppies_creation.model.PuppyPojo;

public interface PupCreationRepo extends MongoRepository<PuppyPojo, String>{

}
