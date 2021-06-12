package com.inbuilt.classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTime {

	public static void main (String a[]) {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd-MMM-yyyy"+"---"+"hh:mm");
		
		System.out.println(date.format(frmt));
		
		
		
		
	}
		

}
