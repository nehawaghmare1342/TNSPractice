package com.tnsif.dayseven.overloading;

public class OverRiddingDemo {
	public static void main(String[] args) {
		RBI rbi;
		
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterset());
		
		rbi=new ICIC();
		System.out.println(rbi.getRateOfInterset());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateOfInterset());
	}

}
