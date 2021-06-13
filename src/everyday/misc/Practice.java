package everyday.misc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice {

	public static void main(String[] args) {
		Practice p = new Practice();			//Method calling starts from here
		
		p.star();

	}
	public void dateTime() {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd-MMM-yyyy"+" ---- "+"hh:mm");
		
		System.out.println(date.format(frmt));
	}
	public void star() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5;	j++) {
				System.out.println("* ");
			}
			System.out.println();
		}
	}

}
