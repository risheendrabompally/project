package com.petcare.Puppies_creation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "puppyColl")
public class PuppyPojo {
	@Id
	private String id;
	private String Breed;
	private String Colour;
	private int age;
	private String imageUrl;


	public PuppyPojo() {
	}

	

	public PuppyPojo(String id, String breed, String colour, int age, String imageUrl) {
		super();
		this.id = id;
		this.Breed = breed;
		this.Colour = colour;
		this.age=age;
		this.imageUrl = imageUrl;
	}



	public String getId() {
		return id;
	}



	public String getBreed() {
		return Breed;
	}



	public void setBreed(String breed) {
		Breed = breed;
	}



	public String getColour() {
		return Colour;
	}



	public void setColour(String colour) {
		Colour = colour;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", Breed=" + Breed + ", Colour=" + Colour + ", age=" + age + ", imageUrl="
				+ imageUrl + ",]";
	}

}
