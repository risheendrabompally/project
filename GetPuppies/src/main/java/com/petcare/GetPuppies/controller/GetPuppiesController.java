package com.petcare.GetPuppies.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petcare.GetPuppies.Model.PuppyPojo;
import com.petcare.GetPuppies.repo.GetPuppiesRepo;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class GetPuppiesController {

	@Autowired
	GetPuppiesRepo repository;
	

	@GetMapping("/pups")
	public List<PuppyPojo> getAllPuppies() {
		System.out.println("Get all Puppies...");
		List<PuppyPojo> puppies = new ArrayList<>();
		repository.findAll().forEach(puppies::add);
		return puppies;
		
//		@GetMapping("/pups")
//		public List<PuppyPojo> getAllPuppies() {
//			System.out.println("Get all Puppies...");
//			List<PuppyPojo> puppies = new ArrayList<>();
//			puprepo.findAll().forEach(puppies::add);
//			return puppies;
		
		}
	}
	
