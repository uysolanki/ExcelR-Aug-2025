package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo3 {

	public static void main(String[] args) {
		String sentance= "one two one one two three four four five";
		Map<String,Integer> counter=new HashMap();
		
		String arr[]=sentance.split(" ");
		for(String n:arr)				
				counter.put(n, counter.getOrDefault(n, 0)+1);
		
		
		System.out.println(counter);
	}

}


/*
{
one : 2
two : 1}
*/