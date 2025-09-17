package day17;

import java.util.Scanner;

public class PalindromeString {
	static String input;
	static char stack[];
	static int top=-1;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");  "Mad am"
		input=sc.nextLine().replaceAll("[^A-Za-z]", "").toLowerCase();  //"madam"      ['m' 'a' 'd' 'a' m]
		stack=new char[input.length()];
		
		for(char ch:input.toCharArray())				//stack		  ch	 st	   ch		flag=0
		{
			push(ch);									//m 4 top      d     d	   a
		}												//a	3 
														//d 2 
		int flag=0;	 //assume Palindrome true			//a 1 
		for(char ch:input.toCharArray())				//m 0 
		{												//	-1 
			char st=pop();
			if(st!=ch)
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

	private static char pop() {
		return stack[top--];
	}

	private static void push(char ch) {
		stack[++top]=ch;	
	}

}
