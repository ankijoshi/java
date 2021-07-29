package everyday.misc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practo {
	public static void main(String[] args) {
	
		Practo p = new Practo();
		
		//p.promeSBtrnry();
		//p.reversing();
		//p.timing();
		//p.stringLoopBreakConti();
		//p.lambda();
		//p.dataConvert();
		//p.searchEngine();
		p.sortNum();
		//p.recursion(1, 20);
		//p.iterators();

	}
	
	public void promeSBtrnry() { 			//palin number reverse using buffer with ternary
		String s = "1211";
		StringBuilder sb = new StringBuilder(s);
		String result = (s.contentEquals(sb.reverse())? "yes":"no");
		System.out.println(result + sb.reverse());
	}
	
	public void reversing() {				//reverse using CharAt
		String s = "ankita";
		String rv= "";
		
		for(int i=s.length()-1; i>=0;i--) {
			rv=rv+s.charAt(i);
		}
		System.out.println(rv);	
	}
	
	public void timing() {					
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd-MMM-yyyy"+"***********"+"hh:mm");
		System.out.println(date.format(frmt));
	}
	
	public void stringLoopBreakConti() {	//print full string using ForEach with continue;
		int s [] = {23,99,45,56,12,80};
		
		Arrays.sort(s);
		
		for(int result:s) 
			System.out.println(result);
			System.out.println("\n");
		for(int i=s.length-1;i>=0;i--) {
			System.out.println(s[i]);
			
		}
	}	
	
	public void iterators() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(23);
		ar.add(99);
		ar.add(56);		
													// CORRECT THIS ONE
		Iterator<Integer> it = ar.iterator();
		
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(ar);
		}
		
	}
	
	public void lambda() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(45);
		hs.add(12);
		hs.add(78);
		hs.add(45);
		//hs.forEach((n)->System.out.println(n));
		hs.forEach((n)->{if(n==12)System.out.println(n);});
	}
	
	public void dataConvert() {				//Wrapper class in Interview.
		String s ="100";
		System.out.println(s+3);
		int i = Integer.parseInt(s);
		System.out.println(i+20);
		
		double d = Double.parseDouble(s);
		System.out.println(d+3);
		
		s=String.valueOf(d);
		System.out.println(s+3);
	}
	
	public void searchEngine() {			//Patterns class in INBuilt  //Try Scanner
		Pattern ptrn = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
		Matcher mtr = ptrn.matcher("Hello, h r u");
		boolean b = mtr.find();
		String result= (b)? "match found":"match not found";
		System.out.println(result);
		
	}
	
	public void sortNum() {
		int num[] = {1,3,0,5,0,8};
		for(int result:num) {
			if(result==0) {
				continue;
			}
			System.out.println(result);
		}
		for(int i=0; i<=4; i++) {
			if(num[i]!=0) {
				continue;
			}
			System.out.println(num[i]);
		}
	}
	
	public void recursion(int x, int y) {
		if(x<=y) {
			System.out.println(x);
			x++;
			recursion(x,y);
		}
		
	}
}
