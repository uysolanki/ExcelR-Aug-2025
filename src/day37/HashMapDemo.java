package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> emps=new HashMap();
		emps.put("Alice",800);
		emps.put("Ben",900);
		emps.put("Chris",1000);
		emps.put(null,1000);
		emps.put(null,999);
		emps.put("Chris",1200);
		System.out.println(emps);
		
		
		
		
		
		
		Map<String,Integer> emps1=new HashMap();
		emps1.put("Alice",800);
		emps1.put("Ben",900);
		emps1.put("Chris",1000);
		emps1.put("David",1200);
		
		int sum=0;
		for(Entry<String,Integer> emp:emps1.entrySet())
		{
			sum=sum+emp.getValue();
		}
		
		System.out.println(sum);
		
		
		Map<String,List<String>> jobseekers=new HashMap<String, List<String>>();
		
		jobseekers.put("Java", new ArrayList(Arrays.asList("Alice","Ben","Chris")));
		jobseekers.put("Php", new LinkedList(Arrays.asList("David","Frank","John","Tom")));
		
		System.out.println(jobseekers);
		System.out.println(jobseekers.get("Java"));
		
		for(Entry<String,List<String>> jobseeker:jobseekers.entrySet())
		{
			System.out.println(jobseeker.getKey() + " " + jobseeker.getValue().size());
		}

	}

}
