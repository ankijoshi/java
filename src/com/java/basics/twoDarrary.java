package com.java.basics;                    //Static Array bcz its size is fixed

// In 1D Array: String s[] = new String[4];
//lowest bound/index is = 0
//upper bound/index is = n-1 i.e. 4-1 = 3   bcz it is starting from 0.. so 0,1,2,3.. total 4.

public class twoDarrary {

	public static void main(String[] args) {
		
		/* 1. initializing static array.. Size is fixed. 
		      its opposite, use collections, ArrayList, HashTable.. means dynamic Array
		   2. Stores only similar Datatypes..Opposite use.. Object array. */
		
		Object i[][] = new Object[2][2];
		i[0][0] = 'c';
		i[0][1] = 20.88;
		
		i[1][0] = "Hey";
		i[1][1] = 40;
		
		System.out.print(i.length + " - ");  //row length
		System.out.println(i[0].length);     //column length
		
		for(int row=0;row<i.length;row++){
			for(int col=0;col<i[0].length;col++){
				System.out.println(i[row][col]);
			}
			
		}
	
	}

}
