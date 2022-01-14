package week3.day2assignments;


import java.util.LinkedHashSet;

import java.util.Set;

public class RemoveDuplicatesInString {
public static void main(String[] args) {
	
	String text="We learn java basics as part of java sessions in java week1";
	
	
		String[] input = text.split(" ");
	 
		Set<String>str=new LinkedHashSet<String>();
		for(String s:input)
			str.add(s);
			
		System.out.println(str);
		
		}
		
}
    