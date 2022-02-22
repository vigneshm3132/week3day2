package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String company = "Paypal India";
		
		char[] ch = company.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		Set<Character> dupcharSet = new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length-1; i--) {
			
			if (charSet.contains(ch[i])) {
				dupcharSet.add(ch[i]);
			} else {
				charSet.add(ch[i]);
			}
			
			charSet.remove(i);
			System.out.println("charset" + charSet);
			System.out.println("dupcharset" + dupcharSet);
		}
	}
}
