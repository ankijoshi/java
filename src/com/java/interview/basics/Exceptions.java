package com.java.interview.basics;

public class Exceptions {

	public static void main(String[] args) {
		
		//Double try catch using finally Keyword..// *********Yo baat :-D
		try {
			int i[] = {1, 2, 5};
			System.out.println(i[6]);
		} catch (Exception e) {
			System.out.println("Something is Invalid");
		} finally {
			try {
				int i2[] = {24,23,22,21};
				System.out.println(i2[0]);
			}catch (Exception e) {
				System.out.println();
			}
			finally {
				System.out.println("All good");
			}
		}
	
		
		
		
		
	}

}
