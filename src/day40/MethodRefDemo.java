package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodRefDemo {

	public static void main(String[] args) {
		
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		Stream<String> stream1=null;
		stream1=months.stream();
//		stream1.forEach(System.out::println);
//		stream1=null;
//		stream1=months.stream();
//		List<String> monthsSizeGreaterThan5 = stream1.filter((month)->month.length()>=5).map((month)->month.toUpperCase()).toList();
//		System.out.println(monthsSizeGreaterThan5);
		
		stream1.filter(MethodRefDemo::checkLength).map(MethodRefDemo::myUpper).forEach(System.out::println);
	}
	
	public static boolean checkLength(String str)
	{
		return str.length()>=5;
	}
	
	public static String myUpper(String str)
	{
		return str.toUpperCase();
	}

}
