package com.tnsif.dayfive.singleinheritance;

public class Citizen {
	
	private String name;
	private String adharNo;
	private String address;
	private long phone;
	
	//Non Parametric Constructor
	
	public Citizen() {
		System.out.println("Citizen object created");
	}

	
	//parameteric Constructor
	
	public Citizen(String name, String adharNo, String address, long phone) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
		this.phone = phone;
	}
	
	//Getter and Setter
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	

}
