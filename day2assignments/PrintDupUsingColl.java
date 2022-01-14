package week3.day2assignments;

import java.util.ArrayList;
import java.util.List;

public class PrintDupUsingColl {
	
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer>data=new ArrayList<Integer>();
		int count=0;
		int temp;
		for(int a:arr)
			data.add(a);
		
		System.out.println(data);
		int size = data.size();
		
		for(int i=0;i<size;i++) {
			count=1;
			for(int j=i+1;j<size;j++) {
				if(data.get(i)==data.get(j)) {
				count++;
				temp=data.get(i);
				}}
				if(count>1)
				
				System.out.println(data.get(i));
				
				
			
		}
		}
	}
					
			
		
		
		
	

