package com.java.basics;

public class dim1n2 {

	public static void main (String a []) {
		Object obj[][] = new Object[2][4];
		
		obj[0][0]='a';
		obj[0][1]='n';
		obj[0][2]='k';
		obj[0][3]='i';
		
		obj[1][0]='j';
		obj[1][1]='o';
		obj[1][2]='s';
		
		for(int row=0; row<obj.length; row++) {
			for(int col=0; col<obj[0].length; col++) {
				System.out.println(obj[row][col]);
			}
		}
	}
}
