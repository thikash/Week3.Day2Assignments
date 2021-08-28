package assignmentWeek3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindInterSectionArray {

	public static void main(String[] args) {

		Integer[] arr = { 3, 2, 11, 4, 6, 7 };
		Integer[] arr2 = { 1, 2, 8, 4, 9, 7 };
		// Set the Integer comp1
		Set<Integer> comp1 = new HashSet<Integer>();
		// addAll to arr
		comp1.addAll(Arrays.asList(arr));
		// set the Integer comp2
		Set<Integer> comp2 = new HashSet<Integer>();
		// addAll to arr2
		comp2.addAll(Arrays.asList(arr2));

		comp2.retainAll(comp1);
		System.out.println(comp2);

	}

}
