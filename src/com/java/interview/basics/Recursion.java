package com.java.interview.basics;

public class Recursion {
	
	static {
		System.out.println("I'm the 1st" + "  -----  YOOHOOOOO");
	}

	public static void main(String s[] ) {
		System.out.println("Oh Really :-/");
		recursive(0, 9);

	}
	
	public static void	recursive(int i, int j) {
		if (i<=j) {
			System.out.print(i);
			i++;
			recursive(i, j);
		}
		
	}

}
