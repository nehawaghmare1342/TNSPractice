package com.tnsif.dayone;

public class IdentifierDemo {

	
public static void main(String[] args) {

		
		//varibles declaration - Invalid Identifier Examples 
		
		//int for=13;// error because keyword cannot be identifier 

		//int num 1=13;  // error because do not add space 
		
		//int @num3=13;  //error because identifier can not start with specials symbol except $_
		
		//valid Identifier Examples 
		
		int $num1= 20;
		
		System.out.println("Values of the number varible is :"+ $num1);
		
		String studentName="Shreya";
		
		System.out.println("value is "+ studentName);
		
		
		
	}
}
