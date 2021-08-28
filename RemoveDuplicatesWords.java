package assignmentWeek3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1 sessions";
		int count=0;
		String[] words = text.split(" ");
		Set<String> uniqueWords = new LinkedHashSet<String>();
		Set<String> duplicateWords=new LinkedHashSet<String>();

		for (String eachWord : words) {
			count++;
			if(!uniqueWords.add(eachWord)) {
				duplicateWords.add(eachWord);
				
			}
			}
		System.out.println("Duplicate Words:"+duplicateWords);

		 
		for (String wd : uniqueWords) {
			System.out.print(wd+"  ");
		}
	}

}
