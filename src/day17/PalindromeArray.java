package day17;

import java.util.Scanner;

public class PalindromeArray {
	static int arr[]= {10,20,30,20,10};
	static int stack[]=new int[arr.length];
	static int top=-1;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {		//i			arr[i]		stack		//data
													//0			10						50
		for(int i=0;i<arr.length;i++)				//1			20			50
		{											//2			30			40
			push(arr[i]);							//3			20			30
		}											//4			10			20						
													//						10	
		int flag=0;	//assume Palindrome
		for(int i=0;i<arr.length;i++)
		{
			
			int data=pop();
			if(arr[i]!=data)
			{
				flag=1;	   //Not Palindrome
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Palindrome Array");
		else
			System.out.println("Not Palindrome Array");
											
	}

	private static int pop() {
		return stack[top--];
	}

	private static void push(int data) {
		top++;
		stack[top]=data;
	}

}
