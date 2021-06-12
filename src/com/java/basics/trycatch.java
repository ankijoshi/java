package com.java.basics;

public class trycatch {

	public static void main(String[] args) {
		
		m1();
		//	m2();
		
		
		}
	
	public static void m1(){
		int num1, num2;
	      try {
	        
	         num1 = 0;
	         num2 = 62 / num1;
	         System.out.println(num2);
	         System.out.println("Hey I'm at the end of try block");
	      }
	      catch (ArithmeticException any) { 
	        
	         System.out.println("You should not divide a number by zero");

	}
	}
	 public static void m2(){
		 int num1, num2;
	         num1 = 0;
	         num2 = 62 / num1;
	         System.out.println(num2);
	         System.out.println("Hey I'm at the end of try block");
	 }
}

	
	


