//display the perfect square of the numbers in the given arraylist

package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperitiveDemo {

	public static void main(String[] args) 
	{	
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		System.out.println(numbers);
		List<Integer> squareNumbers=new ArrayList();
		
		for(int n: numbers)
		{
			int square=n*n;
			squareNumbers.add(square);
		}
		
		
		for(int n: squareNumbers)
		{
			System.out.println(n);
		}

	}

}
