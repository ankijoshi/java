package com.java.basics;              //call by value     //call by ref

public class callbyvalref {
	int p;   //declaring 2 global variables
	int q;

	public static void main(String[] args) {
		callbyvalref obj = new callbyvalref();
		int x = 10;
		int y = 20;
		obj.sum(x, y);  // pass by value
		
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);	
	}
	public int sum(int a, int b){
		int c = a+b;
		return c;
	}
	public void swap(callbyvalref t){ //pass by ref
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}
	
}
