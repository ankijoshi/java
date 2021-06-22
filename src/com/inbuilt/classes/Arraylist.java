package com.inbuilt.classes;                   //Dynamic Array i.e  ARRAYLIST
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
	ArrayList<String> ar = new ArrayList<String>();    //creating obj of predefined class
	// <String> accepts only string value
	//  We can add duplicate values as well
	
	ar.add("hello");
	ar.add("asdf");
	ar.add("world");
	ar.add("yahoo");
	ar.add("asdf");
	ar.remove(3);
	
	System.out.println(ar); 			//Printing FULL at once--print all
	System.out.println(ar.size());		//Printing arraylist Size
	System.out.println(ar.get(2));		//Getting value of index 2
	
	ar.set(1, "Anki");					//Value replaced of index 1
	System.out.println(ar.get(1));
	
	ar.clear(); 						//Full list deleted
	System.out.println(ar.size());
	
		
	//for(int i=0; i<ar.size();i++){
		//System.out.println(ar.get(i));
	//}

	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(14);   // accept only integer
	

	}

}
