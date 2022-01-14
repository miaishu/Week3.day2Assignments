package week3.day2assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargestUsingColl {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		
		List<Integer> num= new ArrayList<Integer>();
		for(int i:data)
		
			num.add(i);
			System.out.println(num);
			int size=num.size();
			System.out.println(size);
			int secLar=num.get(size-2);
			System.out.println(secLar);
					
		
	}
	
	
	

}
