package com.inbuilt.classes;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Object, Object> h = new HashMap<Object, Object>();
		
		h.put(1, "wow");
		h.put(2, 34);
		h.put(3, 87);
		h.put(4, "yeee");
		h.put(5, 34.55);
		h.put(6, "wow");
		
		System.out.println(h);					//printing Horizontal
		
		for(Object s : h.keySet()) {			//printing Vertical
			System.out.println(s+": "+h.get(s));
		}
		System.out.println();					//Blank Space
		h.replace(3, h);						//Replaced index 3.
		System.out.println(h);
		System.out.println(h.get(5));
		h.clear();
		System.out.println(h);
		


	}

}
