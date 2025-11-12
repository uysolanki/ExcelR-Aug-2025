package day38;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedCharFromString {
public static void main(String[] args) {
	
	//String name="Mahendra Singh Dhoni";  //output : i
	String name="Virat Kohli"; 
	name = name.replaceAll("\\s+", "").toLowerCase();
	
	System.out.println(name);
	Map<Character,Integer> hashmap=new HashMap();
	for(char ch:name.toCharArray())
		hashmap.put(ch,hashmap.getOrDefault(ch,0)+1);
	
	System.out.println(hashmap);
	
	for(char ch:name.toCharArray())	  //ch
	{								 //m
		if(hashmap.get(ch)>1)
		{
			System.out.println("First Repeating Char "+ch);
			break;
		}
	}
	
}
}
