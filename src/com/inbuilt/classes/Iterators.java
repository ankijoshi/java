package com.inbuilt.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		// this array list is without generics
		
		ar.add(34);
		ar.add("hello");
		ar.add(35.9);
		
		Iterator<Object> it = ar.iterator();
		// Iterator is also without generic :-D
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
