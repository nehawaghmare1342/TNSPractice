package com.tnsif.dayseven.overloading;

public class OverLoadingDemo {
	
	public static void main(String[] args) {
		System.out.println("-----Constructor Overloading");
		
		Point p = new Point(14.5f);
		System.out.println(p);
		
		Point p1 = new Point(14.5f);
		System.out.println(p1);
		Point p2 = new Point(5.5f,20.5f);
		System.out.println(p2);
		System.out.println("-----Method Overloading-----");
		System.out.println("Addition of two integer numbers"+MethodOverloadingDemo.addition(5,6));
		System.out.println("Addition of two float numbers"+MethodOverloadingDemo.addition(5.8f, 6.9f));
		System.out.println("Addition of two String numbers"+MethodOverloadingDemo.addition("5", "9"));
	}

}
