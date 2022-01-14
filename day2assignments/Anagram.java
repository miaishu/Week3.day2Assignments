package week3.day2assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
	/*
	*Declare a String 
	String text1 = "stops";
 *Declare another String
	String text2 = "potss"; 
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 */
	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int length1 = text1.length();
		int length2 = text2.length();
		if(length1==length2) {
			System.out.println("Length of the strings are same");
		}
		else {
			System.out.println("Length of the strings are not same");
		}
		
		char[] Input1 = text1.toCharArray();
		System.out.println(Input1);
		char[] Input2 = text2.toCharArray();
		System.out.println(Input2);
		 Arrays.sort(Input1);
		System.out.println(Input1);
		//System.out.println(Input1.length);		
		
		Arrays.sort(Input2);
		System.out.println(Input2);
		
		//System.out.println(Input2.length);
		
		if(Arrays.equals(Input1,Input2)) {
		
		System.out.println("The values are same");
		}
		else 
				
		System.out.println("The values are not same");
	
		
		
	
	}
}

