package week3.day2assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersecUsingColl {
	public static void main(String[] args) {
	int[] a= {3,2,11,4,6,7};	 
		int[] b=  {1,2,8,4,9,7};
		
		List<Integer> input1=new ArrayList<Integer>();
		for(int i:a)
			input1.add(i);
		Collections.sort(input1);
		System.out.println(input1);
		int size1 = input1.size();
		
		List<Integer> input2=new ArrayList<Integer>();
		for(int c:b)
			input2.add(c);
		Collections.sort(input2);
		int size2 = input2.size();
		System.out.println(input2);
		
		for(int i=0;i<size1-1;i++) {
			for(int j=0;j<size2-1;j++)
		{
				if(input1.get(i)==input2.get(j))
		
			System.out.println(input1.get(i));
		}
		}
		
	}

}
