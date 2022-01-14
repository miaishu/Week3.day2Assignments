package week3.day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingCollections {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer>elements=new ArrayList<Integer>();
				
		for(int me:arr)
			elements.add(me); 
		System.out.println(elements);
		Collections.sort(elements);
		System.out.println(elements);
		//System.out.println(elements.get(0));
		
		for(int i=1;i<elements.size();i++)
			if(i!=elements.get(i-1))
			{
				System.out.println("The missing element is "+i);
				break;
			}
				
					
	}

}
