package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo4 {

	public static void main(String[] args) {
		String sentance= "apple";
		Map<Character,Integer> counter=new HashMap();
		
		for(char n:sentance.toCharArray())				
				counter.put(n, counter.getOrDefault(n, 0)+1);
		
		
		System.out.println(counter);
	}
}


/*
{
one : 2
two : 1}
*/