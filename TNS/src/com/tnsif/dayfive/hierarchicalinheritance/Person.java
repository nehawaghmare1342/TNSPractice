package com.tnsif.dayfive.hierarchicalinheritance;

public class Person {

	private String name;
	private String city;
	
	public Person() {
		System.out.println("Person class degault constructor");
		this.name=name;
		this.city=city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
}
