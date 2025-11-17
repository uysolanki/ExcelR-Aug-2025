package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		
//		numbers.stream().map((num)->num*num).forEach((number)->System.out.println(number));
//		numbers.stream().map((num)->num*num).forEach(System.out::println);
//		numbers.stream().filter((num)-> num%2==1).forEach((number)->System.out.println(number));
		
		numbers.stream().map((num)->num*num).forEach(StreamAPIDemo::displayNumber);
//		
//		System.out.println("****");
//		numbers.stream().filter((num)-> num%2==1).forEach((number)->System.out.println(number));
//		
//		numbers.stream().filter(StreamAPIDemo::checkOdd).forEach((number)->System.out.println(number));
//		
//		numbers.stream().filter(StreamAPIDemo::checkOdd).forEach(StreamAPIDemo::displayNumber);
//		
//		numbers.stream().filter((num)-> num%2==1).forEach(System.out::print);
//		
	}
	
	public static void displayNumber(int number)
	{
		System.out.println(number);
	}
	
	public static boolean checkOdd(int number)
	{
		if(number%2==1)
			return true;
		else
			return false;
	}

}
