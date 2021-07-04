package com.inbuilt.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pats {

	public static void main(String[] args) {
		Pattern ptrn = Pattern.compile("anki", Pattern.CASE_INSENSITIVE);
		Matcher m = ptrn.matcher("My name is anki");
		 
		boolean matchFound = m.find();
		if (matchFound) {
			System.out.println("Match Found");
		} else {
			System.out.println("Match not Found");
		}
		

	}

}
