package com.java.basics;

public class constctr {
	
	String name;	//Global Vars
	int age;
	
	public constctr() {
		System.out.println("I'm Default Constructor");
	}
	public constctr(String name, int age) {
		System.out.println("I'm THIS keyword in Constructor, Values: "+name+age);
		this.name=name;		//Assigned values to Global vars
		this.age=age;		//Using THIS keyword--indicating Global vars.
	}
	public constctr(double d) {
		System.out.println("I'm Double Constructor, Value= " +d);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		constctr c = new constctr();
		@SuppressWarnings("unused")
		constctr c1 = new constctr(22.1);
		@SuppressWarnings("unused")
		constctr c2 = new constctr("Aru", 25);
	}
}
