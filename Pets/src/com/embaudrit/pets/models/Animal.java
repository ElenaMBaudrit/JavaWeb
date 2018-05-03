package com.embaudrit.pets.models;

public class Animal {
	private String name;
	private String breed;
	private int weight;

	
//	Here comes the constructor:
	public Animal (String name, String breed, int weight) {
		this.name =  name;
		this.breed =  breed;
		this.weight = weight;
	}
	
// 	Setters and Getters:
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed (String breed) {
		this.breed = breed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight (int weight) {
		this.weight = weight;
	}
	
//The methods must be here... Soon to come...
	public void displayAnimal() {
		System.out.println("Pet's name is " + name);
		System.out.println("Pet's breed is: "+breed);
		System.out.println("Pet's weight is: "+weight);
	}
}