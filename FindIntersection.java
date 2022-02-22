package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		 // a) Declare An array for {3,2,11,4,6,7};	 
		Integer arr[] = {3,2,11,4,6,7};	
		 // b) Declare another array for {1,2,8,4,9,7};
		Integer arr1[] = {1,2,8,4,9,7};
		
		List<Integer> intarr = new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> intarr1 = new ArrayList<Integer>(Arrays.asList(arr1));
		
		intarr.retainAll(intarr1);
		System.out.println(intarr);
		
	}
	
	
	
}
