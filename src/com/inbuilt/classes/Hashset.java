package com.inbuilt.classes;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("abc");
		hs.add("xyz");
		hs.add("efg");
		hs.add("xyz");
		
		System.out.println(hs);
		System.out.println(hs.contains("asdf"));
		System.out.println(hs.contains("xyz"));
		System.out.println("\n******************************\n");
		
		for(String s:hs) {						//*****************for-each Loop
			System.out.println(s);
		}
		

	}

}
