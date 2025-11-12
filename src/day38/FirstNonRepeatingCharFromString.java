package day38;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharFromString {
	public static void main(String[] args) {

		// String name="Mahendra Singh Dhoni"; //output : i
		// String name="Virat Kohli";
		//String name = "KKK";
		String name = "";
		char c = findChar(name);
		if (c == '0')
			System.out.println("No Char Found");
		else if (c == '1')
			System.out.println("Invalid Input");
		else
			System.out.println("First Non Repeating Char " + c);
	}

	private static char findChar(String name) {
		if(name.length()==0 || name==null)
			return '1';
		name = name.replaceAll("\\s+", "").toLowerCase();

		System.out.println(name);
		Map<Character, Integer> hashmap = new HashMap();
		for (char ch : name.toCharArray())
			hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);

		System.out.println(hashmap);

		for (char ch : name.toCharArray()) // ch
		{ 
			if (hashmap.get(ch) == 1)
				return ch;
		}
		return '0';
	}
}
