package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElements {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		
		Arrays.sort(arr);
	
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			
			// check if the iterator variable is not equal to the array values respectively
			if(arr[i] != i+1)
			{
				System.out.println((i+1));
				break;				
			}
			}
		}

}