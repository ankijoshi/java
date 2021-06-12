package com.inbuilt.classes;					// Another Dynamic Array Class:---HashTable

import java.util.Hashtable;

public class HashTBL {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();   //simple Hashtable object
										 //Enter any value in Key Value format
		h.put(1, "anki");
		h.put(2, "joshi");
		h.put(3, "Aru");
		
		System.out.println(h.size());
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer,Integer>();
										//Now only Integer Key & Integer Value allowed
		h1.put(1, 45);
		System.out.println(h1.get(1));

	}

}
