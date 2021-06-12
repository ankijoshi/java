package com.java.basics;

public class loopstrings {

	public static void main(String[] args) {
	
		
/* disadvantage WHILE LOOP: It can be infinite if u forgot to add increment statement.
   Syntax itself is not a good practice. Obviously people will forget */
		
		int i=1;
		while(i<=10){
			System.out.print(i);
			i=i+1;
		}
		
		System.out.println();
		
		for(int j=1; j<=10; j++){
			System.out.println(j);
		}
		
		// post/pre increment/decrement operators
		
		int k=i--;
		System.out.println(i);
		k = i++;
		k= ++i;
		System.out.println(i+k);
	}

}
