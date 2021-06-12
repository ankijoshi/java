package com.inbuilt.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class iterators {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		// this array list is without generics
		
		ar.add(34);
		ar.add("hello");
		ar.add(35.9);
		
		Iterator it = ar.iterator();
		// Iterator is also without generic :-D
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
