package com.java.interview.basics;

import java.util.Scanner;

public class Interview {

	public static void main(String[] args) {
		//PrintInt();
		//ASCII();   
	

	}
	
	public static void PrintInt(){
		Scanner reader = new Scanner(System.in); //check
		System.out.println("Enter Numbers");
		
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
//		int add = num1+num2;
//		System.out.println("Number is: "+add);
		System.out.println("Number is: " +(num1+num2));  //2nd Way
		reader.close();
	}

	public static void Ascii(){
		byte c = 't';
		int ai = c;
		
		int asciinum = (int)c;
		System.out.println("ascii value is: " + asciinum + ai);
	}
	
	
	
	
	
	
	
	
	
	
	
}
