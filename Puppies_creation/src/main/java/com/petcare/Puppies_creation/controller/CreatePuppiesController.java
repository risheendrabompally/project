package com.petcare.Puppies_creation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petcare.Puppies_creation.model.PuppyPojo;
import com.petcare.Puppies_creation.repo.PupCreationRepo;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CreatePuppiesController {
	
	@Autowired
	PupCreationRepo puprepo;
	
//	@GetMapping("/pups")
//	public List<PuppyPojo> getAllPuppies() {
//		System.out.println("Get all Puppies...");
//
//		List<PuppyPojo> puppies = new ArrayList<>();
//		puprepo.findAll().forEach(puppies::add);
//
//		return puppies;
//	}
	
@PostMapping("/pups/create")
public PuppyPojo postPup(@RequestBody PuppyPojo puppy) {

	PuppyPojo puppies = puprepo.save(puppy);
//	Puppy puppies = puprepo.save(new Puppy(puppy.getId(),puppy.getBreed(),puppy.getColour(),puppy.getAge(),puppy.getImageUrl()));
	return puppies;
}
	

}
