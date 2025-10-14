package day25;

import java.util.Arrays;

public class StringSentance3 {

	public static void main(String[] args) {
		String sentance="my name is Alice I stay in Pune I am doing BCA";
		
		String words[]=sentance.split(" ");
		
		String wordCount[][]=new String[words.length][2];
		
		for(int i=0;i<words.length;i++)						//i		 words[i]	wordlength 
		{													//0		 my			"2"
			int wordLenght=words[i].length();				//1      name       4
			wordCount[i][0]=words[i];
			wordCount[i][1]=Integer.toString(wordLenght);
		}
		
		for(int i=0;i<words.length;i++)		//no of rows				//i			wordlength
		{
				for(int j=0;j<2;j++)
				{
					System.out.print(wordCount[i][j] + " ");
				}
				System.out.println();
		}
		
	}

}

/*
my 2
name 4
is 2
Alice 5
*/