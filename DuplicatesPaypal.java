package assignmentWeek3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesPaypal {
	public static void main(String[] args) {
		String str = "PayPal India";
//String to Lowercase
		String strLC = str.toLowerCase();
//String to ReplaceAll
		String strRpl = str.replaceAll("//s", "");
//convert string to character Array
		char[] charArray = strRpl.toCharArray();
		// Declare a set as charset for character
		Set<Character> charset = new LinkedHashSet<Character>();
//Declare a set a dupCharSet for duplicate character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
//Iterate the character Array
		for (char c : charArray) {
			boolean compare = charset.add(c);
//if the character is already in the charset then add it to the dupcharset
			if (compare == false) {
				dupCharSet.add(c);
			}
		}
		//get the output Duplicate characters
		System.out.println("Duplicate Characters:"+dupCharSet);
		//get the output of Character set after removing duplicates
		System.out.println("Character set:"+charset);

	}
}