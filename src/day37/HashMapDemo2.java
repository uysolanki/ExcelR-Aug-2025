package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Map<String,Integer> counter=new HashMap();
		for(int n:arr)				//n=3
		{
			if(n%2==0)
				counter.put("even", counter.getOrDefault("even", 0)+1);
			else
				counter.put("odd", counter.getOrDefault("odd", 0)+1);
		}
		
		System.out.println(counter);
	}

}


/*
{odd : 3
even : 2}
*/