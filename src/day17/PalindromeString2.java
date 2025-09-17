package day17;

import java.util.Scanner;

public class PalindromeString2 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");  //"Mad am"
		String input=sc.nextLine().replaceAll("[^A-Za-z]", "").toLowerCase();  //"madam" 
																				//       i
																				//    0  1   2   3   4
		char inputArray[]=input.toCharArray();								    //  ['m' 'a' 'd' 'a' m]
		
		int flag=0;
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]!=inputArray[inputArray.length-1-i])
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Palindrome String");
		else
			System.out.println("Not Palindrome String");
		
	}

	
}
