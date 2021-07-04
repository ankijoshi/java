package com.inbuilt.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {
	static Pattern ptrn;
	static Matcher mtr;
	static boolean bln;
	static String s;

	public static void main(String[] args) {
		ptrn = Pattern.compile("hari", Pattern.CASE_INSENSITIVE);
		mtr = ptrn.matcher("My name is Anki");
		bln = mtr.find();
		
		if (bln) {
			System.out.println("match found");
		} else {
			System.out.println("match not found");
		}
		
		

	}

}
