package day17;

import java.util.Scanner;

public class PalindromeString {
	static String input;
	static char stack[];
	static int top=-1;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");
		input=sc.nextLine().replaceAll("[^A-Za-z]", "").toLowerCase();  //"malayalam"   'm' 'a' 'l' ..
		stack=new char[input.length()];
		
		for(char ch:input.toCharArray())				//stack			 st	   ch
		{
			push(ch);									//e 4            e	   a
		}												//l	3 top
														//p 2
		int flag=0;										//p 1
		for(char ch:input.toCharArray())				//a 0
		{
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
