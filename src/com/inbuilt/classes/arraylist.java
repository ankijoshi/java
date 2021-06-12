package com.inbuilt.classes;                   //Dynamic Array i.e  ARRAYLIST
import java.util.ArrayList;
public class arraylist {

	public static void main(String[] args) {
	ArrayList<String> ar = new ArrayList<String>();    //creating obj of predefined class
	// <String> accepts only string value
	//  We can add duplicate values as well
	
	ar.add("hello");
	ar.add("asdf");
	ar.add("world");
	
	System.out.println(ar.size());
	System.out.println(ar.get(2));
		
	for(int i=0; i<ar.size();i++){
		System.out.println(ar.get(i));
	}

	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(14);   // accept only integer
	

	}

}
