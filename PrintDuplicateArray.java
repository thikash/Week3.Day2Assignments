package week3.day2;


import java.util.LinkedHashSet;

import java.util.Set;

public class PrintDuplicateArray {

	public static void main(String[] args) {
		int[] arr= {10, 11, 22, 33, 10, 34, 33, 12, 26, 22};
		Set<Integer> n=new LinkedHashSet<Integer>();
           for(Integer d:arr) {
        	   if(!n.add(d)) {
        		   System.out.println("Duplicate values are:"+d);
        	   }
        	  
           }
	}

}
