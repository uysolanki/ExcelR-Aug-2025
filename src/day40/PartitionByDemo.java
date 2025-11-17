package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo {

	public static void main(String[] args) {
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		
		Map<Boolean,List<String>> map=months.stream().collect(Collectors.partitioningBy((month)->month.length()>=5));
		System.out.println(map);
		
		Map<Boolean,Long> map1=months.stream().collect(Collectors.partitioningBy((month)->month.length()>=5,Collectors.counting()));
		System.out.println(map1);
	}

}
