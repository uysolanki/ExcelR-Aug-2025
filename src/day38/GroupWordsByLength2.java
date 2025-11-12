package day38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupWordsByLength2 {

	public static void main(String[] args) {
		String sentance="one two three four five six";
		List<List<String>> groups=findGroup(sentance);
		System.out.println(groups);

	}

	private static List<List<String>> findGroup(String sentance) {
		String arr[]=sentance.split(" "); //[one two three four five six]
		
		List<List<String>> result=new ArrayList();
		Map<Integer,List<String>> hashmap=new HashMap();
		
		for(String word:arr)
		{									//word : three
			int length=word.length();		//length =5
			hashmap.putIfAbsent(length, new ArrayList());
			
			hashmap.get(length).add(word);
		}
		
		for(Entry<Integer,List<String>> entry:hashmap.entrySet())
		{
			result.add(entry.getValue());
		}
		
		return result;
	}

}

/*
{
3 : [one,two,six]}			
5 : [three]
4 : [four,five]
*/