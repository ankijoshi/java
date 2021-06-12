package com.java.interview.basics;

public class TernaryOprtr {

	public static void main(String[] args) {
		TernaryOprtr t = new TernaryOprtr();
		
		ternry();
		t.ifelse();
		t.if2();
		

	}
	
	public static void ternry() {
		int time = 20;
	    String result;
	    result = (time < 18) ? "GOOD DAY." : "GOOD EVENING.";
	    System.out.println(result);
	}
	
	public void ifelse() {
		int time  = 20;
		//String result;
		if (time<18) {
			System.out.println("good day");
		} else {
			System.out.println("good evening");
		}
		
	}
	
	public void if2() {
		String s = "Angita";
		String result = (s.equals("Angita")) ? "Guru's Voice" : "My Voice";
		System.out.println(result);
	}

}
