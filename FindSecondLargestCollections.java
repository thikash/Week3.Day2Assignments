package assignmentWeek3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestCollections {
	public static void main(String[] args) {
		int[] data= {3, 2, 11, 4, 6, 7};
		List<Integer> num=new ArrayList<Integer>();
		for(Integer eachData:data) {
			num.add(eachData);
		}
		Collections.sort(num);
		System.out.println("Sorted data:"+num);
		System.out.println("Length of data is:"+num.size());
		System.out.println("Second Largest of data is:"+num.get(num.size()-2));
	}

}
