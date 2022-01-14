package week3.day2assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] input=test.toCharArray();
		System.out.println(input);
		for(int i=0;i<input.length;i++)
		{
			if(Character.isLetter(input[i]))
				letter++;
			else if(Character.isSpaceChar(input[i]))
				space++;
			else if(Character.isDigit(input[i]))
				num++;
			else
				specialChar++;
						
		}
		
		System.out.println("The number of Letters: "+letter);
		System.out.println("The number of spaces: "+space);
		System.out.println("The number of digits: "+num++);
		System.out.println("The number of specialChar: "+specialChar);
		
		
	}
}
