package assignmentWeek3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementsCollections {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
		Arrays.sort(arr);
		List<Integer> m = new ArrayList<Integer>();
		for (Integer eachData : arr) {
			m.add(eachData);
		}
		for (int i = 0; i < m.size(); i++) {
			if (m.get(i) != i + 1) {
				System.out.println("Missing Element:" + (i + 1));
				break;
			}

		}
	}

}
