package com.tnsif.dayfive.singleinheritance;

public class Student extends Citizen {
	
	private int rollNo;
	private String collegeNameString;
	
	public Student() {
		super();
	}

	public Student(String name, String adharNo, String address, long phone)
	{
		super(name , adharNo , address ,phone);
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeNameString() {
		return collegeNameString;
	}

	public void setCollegeNameString(String collegeNameString) {
		this.collegeNameString = collegeNameString;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeNameString=" + collegeNameString + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
}
