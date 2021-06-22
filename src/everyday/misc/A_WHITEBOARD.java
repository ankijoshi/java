package everyday.misc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A_WHITEBOARD {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd-MMM-yyyy"+"  ----  "+"hh:mm");
		
		System.out.println(date.format(frmt));
		
	
	}

}
