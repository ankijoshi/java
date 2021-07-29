package everyday.misc;

public class Conversion {

	public static void main(String[] args) {
		Conversion c = new Conversion();
		
		c.stringToNums();
	}
	
	public void intToDouble() {						//Widening Casting		int to double
		int i = 9;
		double d = i;
		System.out.println(d);
	}
	public void doubleToInt() {						//Narrowing Casting		double to int
		double d = 25.76;
		int i = (int)d;
		System.out.println(i);
	}
	public void stringToNums() {					//String to int
		String s="100";
		int i= Integer.parseInt(s);
		System.out.println(i+5);
		
		double d = Double.parseDouble(s);			//String to double
		System.out.println(d);
		
		s=String.valueOf(d);						//String to double
		System.out.println(s);
	}

}
