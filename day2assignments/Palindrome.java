package week3.day2assignments;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String input ="madam";
		String inputrev="";
		char[] inputArray=input.toCharArray();
		System.out.println(inputArray);
		int length = inputArray.length;
		System.out.println(length);
		//Iterate over the String in reverse order
		for(int i=length-1;i>=0;i--) {
		inputrev=inputrev+input.charAt(i);
		}
		if(input.equals(inputrev))
		{	
		
			System.out.println("Its Palindrome");
		}
		else {
			System.out.println("Its not a Palindrome");
		}
		
					
	
	
	
	}
}
