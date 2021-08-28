package assignmentWeek3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortCollections {
	public static void main(String[] args) {
		String[] companies = { "Aspire Systems", "CTS", "Wipro", "IBM", "HCL", "Accunture" };

		Set<String> strList1 = new TreeSet<String>();
		// sorted the companies
		for (String eachData : companies) {
			strList1.add(eachData);
		}
		System.out.println("Sorted using Treeset:" + strList1);

		List<String> strList = new ArrayList<String>(Arrays.asList(companies));
		Collections.sort(strList);
		System.out.println("sorted using ArrayList:" + strList);
		// size of the strList
		int size = strList.size();
		System.out.println("size:" + size);
		// Reverse the strList
		Collections.reverse(strList);
		System.out.println("Reverse List" + strList);
	}
}
