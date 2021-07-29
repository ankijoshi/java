package com.inbuilt.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(34);
		ar.add(67);
		ar.add(35);
		ar.add(56);
		ar.add(23);
		
		Iterator<Object> it = ar.iterator();
		
		while(it.hasNext()) {
		      Integer i = (Integer) it.next();
		      if(i >50) {
		        it.remove();
		      }
		    }
		    System.out.println(ar);
	}
	
	
}
