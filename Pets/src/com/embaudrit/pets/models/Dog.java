package com.embaudrit.pets.models;

public class Dog extends Animal implements Pet{
	
	public Dog (String name, String breed, int weight) {
		super(name, breed, weight); // "Super": refers to the Superclass. In the parentheses, only needed the name of the data types.
	}
	
	public void name() {
		System.out.println(getName());
	}
	public void breed() {
		System.out.println(getBreed());
	}
	public void weight() {
		System.out.println(getWeight());
	}
	
	public String showAffection () {
		if (this.getWeight() < 30) { //calling out from the Superclass, will require the this.getSomething
			return "You created a "+this.getBreed()+" named "+this.getName()+", that hopped in your lap and cuddled you!";
		}
		else {
			return "You created a "+this.getBreed()+" named "+this.getName()+", that curled next to you!";
		}
}
	
}
