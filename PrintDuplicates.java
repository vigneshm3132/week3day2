package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		Integer[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
				
		List<Integer> DuplicateNo = new ArrayList<Integer>(Arrays.asList(arr));
				
		Collections.sort(DuplicateNo);
		System.out.println(DuplicateNo);
		
		int size1 = DuplicateNo.size();
				
		for (int i = 1; i < DuplicateNo.size(); i++) {
			
			if(i == DuplicateNo.get(i+1))
			{
				System.out.println(i);
				break;
			}
				
		
		}
		
					}
	
}
