package com.inbuilt.classes;

import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		
		h.put(1, "hellos");
		h.put(2, 'A');
		h.put(3, 145.34);
		
	
		for(int i=1; i<=h.size(); i++){
			System.out.println(h.get(i));
		}
	

	}

}
