package everyday.misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class StringFormatter {

	public static void main(String[] args) {
		//capsWord("hey how are you ");
		//reuse();
		dupli();
	}
	
	public static String capsWord(String s) {
		String ar[] = s.split(" ");
		String row = "";											//Horizontal
		
		for(String result:ar) {
			String fst = result.substring(0, 1);
			String lst = result.substring(1);
			//System.out.println(fst.toUpperCase()+lst);				//Vertical Printing
			row+=fst.toUpperCase()+lst+" ";								//Horizontal
		}
		//System.out.println(row);
		return row;
	}
	
	public static void reuse() {
		//System.out.print(StringFormatter.dupli());
	}
	public static void dupli() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String ary[] = sc.nextLine().split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String result:ary) {
			if(hm.containsKey(result))
				hm.replace(result, hm.get(result)+1);
			else hm.put(result, 1);
		}
		System.out.println(hm);
	}

}
