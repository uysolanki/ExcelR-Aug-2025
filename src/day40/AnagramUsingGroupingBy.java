package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramUsingGroupingBy {

	public static void main(String[] args) {
		List<String> months=new ArrayList(Arrays.asList("silent","bca","abc","note","tone","cab","listen"));
		
		Map<String,List<String>> map=months.stream().collect(Collectors.groupingBy(s->{
			char arr[]=s.toCharArray();
			Arrays.sort(arr);
			return new String(arr);
		}));
		
		System.out.println(map.values());
		
		
		Map<String,Long> map1=months.stream().collect(Collectors.groupingBy(s->{
			char arr[]=s.toCharArray();
			Arrays.sort(arr);
			return new String(arr);
		},Collectors.counting()));
		
		System.out.println(map1);
	}

}
