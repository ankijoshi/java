package com.java.interview.basics;



public class Loopzz {

	public static void main(String[] args) {
		IfReplaced(5);
		//loop2();
		//loop3();
		//loop4();
	}
	
	public static void IfReplaced(int i) {	//Ternary operator
		String result = (i<=3) ? "Smaller Number" : "Greater Number";
		System.out.println(result);
				
	}
	public static void loop2() {			//Break; loop breaking in between
		for(int i=1; i<=8; i++) {
			if (i==5) {break;}
			System.out.println(i);
		}
	}
	public static void loop3() {			//Continue; Loop skip 5 number in between
		for (int i=1; i<=8; i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}	
	}				 //forEach
	public static void loop4() {			//Printing all Array--New Loop called forEach
		String[] cars = {"Tesla", "BMW", "Honda", "Suzuki"};
		for(String i: cars) {
			System.out.println(i);
		}
	}

}
