package day38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByLength {

	public static void main(String[] args) {
		String sentance="one two three four five six";
		
		String arr[]=sentance.split(" ");
		
		Map<Integer,List<String>> hashmap=new HashMap();
		
		for(String word:arr)
		{
			int length=word.length();		//length =3
			hashmap.putIfAbsent(length, new ArrayList());
			
			hashmap.get(length).add(word);
		}
		
		System.out.println(hashmap);

	}

}

/*
{}
*/