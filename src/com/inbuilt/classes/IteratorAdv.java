package com.inbuilt.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorAdv {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(25);
		ar.add(56);
		ar.add(45);
		ar.add(67);
		
		Iterator<Object> it = ar.iterator();
		
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			if (i<50) {			//removing values<50
				it.remove();
			}
		}
		System.out.println(ar);		
	}
}
