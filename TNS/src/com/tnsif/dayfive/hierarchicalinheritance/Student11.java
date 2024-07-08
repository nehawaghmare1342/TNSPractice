package com.tnsif.dayfive.hierarchicalinheritance;

public class Student11 extends Person{
	
	private String Class;
	private float percent;
	
	public Student11() {
		System.out.println("Student class default constructor");
		Class="FY";
		percent=70f;
	}

	
	public Student11(String Class, float percent) {
		super();
		this.Class = Class;
		this.percent = this.percent;
	}


	public String getCLASS() {
		return Class;
	}

	public void setCLASS(String cLASS) {
		Class = class;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}


	public Student(String class, float percent) {
		super();
		this.Class=Class;
				this.percent = percent;
	}

	
}
