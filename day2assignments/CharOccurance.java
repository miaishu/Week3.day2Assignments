package week3.day2assignments;

import java.util.Arrays;

public class CharOccurance {
	public static void main(String[] args) {
		
	
	// Check number of occurrences of a char (eg 'e') in a String

	String str = "welcome to chennai";
	int count=0;
	char[] input=str.toCharArray();
	System.out.println(input);
	int length=input.length;
	System.out.println(input.length);
	
	for(int i=0; i<length-1;i++) {
			
		if(input[1]==input[i]) {
			count=count+1;
			
		}
		
	}
	System.out.println("No of occurances are"+count);
	
	}

}
