package day20;

import java.util.Arrays;

public class AnagramString {
		public static void main(String[] args) {
			String str1="note";
			String str2="tone";
			
			String sentance="note tone onet silent listen";  //collections
			
			char array1[]=str1.toCharArray();  //['l','i','s','t','e','n']
			char array2[]=str2.toCharArray();  //['s','i','l','e','n','t']
			
			Arrays.sort(array1);				//['e','i','l','n','s','t']
			Arrays.sort(array2);				//['e','i','l','n','s','t']
			
			String str11=new String(array1);	//"eilnst"
			String str22=new String(array2);	//"eilnst"
			
			if(str11.equals(str22))
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
			
		}
}
