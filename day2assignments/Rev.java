package week3.day2assignments;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.apache.poi.util.SystemOutLogger;

public class Rev {
	public static void main(String[] args) {
		String test = "I am a software tester";
		
//		String s1= "['I', 'am', 'a', 'software', 'tester']";
		String[] arr=test.split(" ");
	
		
		for(int i=0;i<arr.length;i++)
			
	       {
			String revInput="";
			
			if(i%2==0) {
				//String[] arr1=test.split(" ");
				
				String array=arr[i].toString();
				//System.out.println(array);
				System.out.print(" "+array+" ");
			}
			
			else {
				char[] rev = arr[i].toCharArray();
				for(int j=rev.length-1;j>=0;j--)
			
				revInput=revInput+ rev[j];
				
				String revWords = revInput.toString();
				System.out.print(""+revWords+"");
			}	
			
					
	}
		
		
			
			}
}
		
		//System.out.println(arr1);
		
	



