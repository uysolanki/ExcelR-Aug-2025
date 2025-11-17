//display the perfect square of the numbers in the given arraylist
package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeclarativeDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		
//		List<Integer> squareNumbers=numbers.stream().map((num)->num*num).collect(Collectors.toList());
		
		numbers.stream().map((num)->num*num).forEach((num)->System.out.println(num));
		
		List<Integer> squareNumbers=numbers.stream().map((num)->num*num).toList();
		

		numbers.stream().forEach((num)->System.out.println(num));		
		
		List<Integer> numbers1=new ArrayList(Arrays.asList(20,23,13,14,25));
		int sumAge=numbers1.stream().filter((num)->num>=18).map((num)->num+2).reduce((num,acc)->num+acc).get();
		System.out.println(sumAge);
		
		numbers.stream().map((num)->num*num).forEach(DeclarativeDemo::displayNumber);
		
	}
	
	public static void displayNumber(int number)
	{
		System.out.println(number);
	}
}


/*
[18,19,23,12,17,26]
*/
