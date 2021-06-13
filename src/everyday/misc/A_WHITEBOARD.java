package everyday.misc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A_WHITEBOARD {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
	    System.out.println("Before formatting: " + dt);
	   
	    DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd-MMM-yyyy"+" --- "+"hh:mm");

	    String s = dt.format(frmt);
	    System.out.println("After formatting: " + s);
	}

}
