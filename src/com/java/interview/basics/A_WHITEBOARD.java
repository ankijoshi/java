package com.java.interview.basics;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class A_WHITEBOARD {

	public static void main(String[] args) {
		test();
		
	}
	
	
	public static void test() {
		String s = "aba";
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb1 = sb.reverse();
		String s1 =sb1.toString();
		
		String result = (s.equals(s1))? "yes":"no";
		System.out.println(result);
		


		
	}
}	

