package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList1 {

	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		
		// Adding data into List
		fruits.add("Mango");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("guava");
		System.out.println(fruits);
		
		//size of the list
		int listsize = fruits.size();
		System.out.println(listsize);
		
		//get the element from the list
		for (int i = 0; i < listsize; i++) {
			System.out.println(fruits.get(i));
		}
		
		System.out.println("Foreach List is");
		
		for (String newFruit : fruits) {
			System.out.println(newFruit);
		}
		
		System.out.println("Inserting element");
		
		fruits.add("guava");
		
		System.out.println(fruits);
		
		fruits.remove("guava");
		System.out.println(fruits);
	}
}
