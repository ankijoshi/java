package com.java.basics;

public class GlobalLocalVariable {
	int mod;                    // class variable OR global variable
	int wheel;                  // can be used within the class.

	public static void main(String[] args) {
		
		String i = "10";  // Local variable cz we can use it inside the main method only
		// No object required to access local variable
		
		
		
		// object required to access global variable
		GlobalLocalVariable a= new GlobalLocalVariable();
	//	GlobalLocalVariable b= new GlobalLocalVariable();
	//  we can create end number of objects of our class.
		
		a.mod=		2018;
		a.wheel=	4;
		
		System.out.println(a.mod + " " + a.wheel + " and localV "+i);
	

	}

}
