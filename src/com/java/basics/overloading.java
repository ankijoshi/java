package com.java.basics;					         //non Static mothods.

public class overloading {                  
	//can't create a method inside a method.
	//duplication method but with diff input parameters/arguments.
	public static void mainforcall(String[] args) {   //main method can also be overloaded with diff args.
		
		overloading obj = new overloading(); //always need class object to call non-static methods.
		
		int div = obj.method(12, 4);  //calling 2nd method with args.
		System.out.println(div);
		
		obj.method();   //calling 1st method that is without args.
	}

	public int method(){
		System.out.println("This is returning value of z = 180");
		int x = 80;
		int y = 100;
		int z = x+y;     return z;
		
	}
	
	public int method(int x, int y){
		System.out.print("Returning the multiplication value i.e = ");
		int d = x*y;
		return d;
	}
}
