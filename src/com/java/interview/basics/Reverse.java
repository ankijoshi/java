package com.java.interview.basics;

public class Reverse {
	static String s = "buffers";
	

	public static void main(String[] args) {
		//buffer();
		strloop();
		
	}

	
	public static void buffer() {
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	public static void strloop() {
		String rv = "";
		
		for(int i=s.length()-1; i>=0; i--){
			rv=rv+s.charAt(i);
		}
		System.out.println(rv);
	}
	
}

