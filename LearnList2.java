package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnList2 {

	public static void main(String[] args) {
		
		String vehicle1[] = {"bmw","audi","auto","car","cycle"};
		String vehicle2[] = {"bmw","audi","Honda","bugati","fz"};
		
		//Arrays.asList(arr) : Converts the Array to List
		
		List<String> StrList = new ArrayList<String>(Arrays.asList(vehicle1));
		List<String> StrList2 = new ArrayList<String>(Arrays.asList(vehicle2));
		
		System.out.println(StrList);
	
		Collections.sort(StrList);
		System.out.println(StrList);
		
		Collections.reverse(StrList);
		System.out.println(StrList);
		
		//StrList.retainAll(StrList2);
		//System.out.println(StrList);
		
		StrList.removeAll(StrList2);
		System.out.println(StrList);
		
		
	}
}
