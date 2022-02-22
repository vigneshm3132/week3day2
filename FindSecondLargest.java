package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		System.out.println(data[4]);
	}
}
