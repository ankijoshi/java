package com.java.basics;                      // calling static & nonstatic func/var
public class callingstatic {
	
	static int age = 20;          //static variable          //global variable
	String name = "Anki";        //non static variable       //global variable
	
	public static void main(String[] args) {
		callingstatic obj = new callingstatic();  //object to call nonstatic func or var. 
		
	sum();                       //Direct calling static method.
	callingstatic.sum();        //indirect calling static method through class name.
	//obj.sum();               //nonstatic way to call static method.     
	
	obj.divide();                  //calling nonstatic func though obj
	System.out.println(obj.name);  //calling nonstatic var though obj
	}

	public static void sum (){
		System.out.println("Static Method");
		
	//calling static variable with 2 diff ways.
		System.out.println(age + callingstatic.age); 
	}
	
	public void divide(){   
		System.out.println("NonStatic Mehtod");
		System.out.println(age + name);   //direct calling nonstatic var inside nonstatic func.
	}
}
