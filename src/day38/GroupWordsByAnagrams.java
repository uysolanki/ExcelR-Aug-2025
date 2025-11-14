package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupWordsByAnagrams {

	public static void main(String[] args) {
		String sentance="silent tone abc listen bac bca note apple";
		List<List<String>> groups=findGroup(sentance);
		System.out.println(groups);

	}

	private static List<List<String>> findGroup(String sentance) {
		String arr[]=sentance.split(" "); 
		
		List<List<String>> result=new ArrayList();
		Map<String,List<String>> hashmap=new HashMap();
		
		for(String word:arr)					//word : listen
		{									
			char arr1[]=word.toCharArray();		//	[l,i,s,t,e,n]
			
			Arrays.sort(arr1);                  //  [e,i,l,n,s,t]
			
			String key=new String(arr1);        //  "eilnst"
			hashmap.putIfAbsent(key, new ArrayList());
			
			hashmap.get(key).add(word);
		}
		
		for(Entry<String,List<String>> entry:hashmap.entrySet())
		{
			result.add(entry.getValue());
		}
		return result;
	}

}

/*
{
eilnst : [silent,listen]}			
enot : [tone]

*/