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
		
		for(Object s : h.keySet()) {			//**********************ye kya tha?
			System.out.println(s+": "+h.get(s));
		}
		System.out.println();
		System.out.println(h);
		h.replace(3, h);
		System.out.println(h);
		System.out.println(h.get(5));
		h.clear();
		System.out.println(h);
		

	}

}
