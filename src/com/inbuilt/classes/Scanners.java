package com.inbuilt.classes;

import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) throws InterruptedException {
		
		
		sumScan();
	//	normalScan();

	}
	
	public static void normalScan() {
		System.out.println("Enter Something");
		
		Scanner s = new Scanner(System.in);		//Scanner class invoked
		String input = s.nextLine();			//with System.in Passed as parameter.
		
		if(input.equals("Hi.. I'm Ankita")) {
			System.out.println("Hey Anki");
		}else {
			System.out.println("Okay Done.. Great");
		}
		s.close();
	}
	public static void sumScan() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number here: ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println("Result is: "+ (a+b));
		s.close();
	}
	

}
