package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {

	public static void main(String[] args) {
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		
		Map<Integer,List<String>> map=months.stream().collect(Collectors.groupingBy(s->s.length()));
		System.out.println(map);
		
		Map<Integer,String> map1=months.stream().collect(Collectors.groupingBy(s->s.length(),Collectors.joining("$$")));
		System.out.println(map1);
		
		Map<Integer,Long> map2=months.stream().collect(Collectors.groupingBy(s->s.length(),Collectors.counting()));
		System.out.println(map2);
		
		
	}

}
