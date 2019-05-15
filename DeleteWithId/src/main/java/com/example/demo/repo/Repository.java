package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Puppy;

public interface Repository extends MongoRepository<Puppy, String> {

}
