package com.embaudrit.pets.models;

public class Cat extends Animal implements Pet{
	
	public Cat (String name, String breed, int weight) {
		super (name, breed, weight); //Check the annotations in Dog.
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
	
	public String showAffection() {
		return "Your "+this.getWeight()+" cat, "+this.getName()+", looked at your with some affection. You think.";
	}
}
