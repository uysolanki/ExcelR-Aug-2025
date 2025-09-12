package day16;

import java.util.Scanner;

public class Test 
{
	static int stack[]=new int[5];
	static int top=-1;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
			
			int choice;
			do {
				System.out.println("**** STACK MENU ****");
				System.out.println("1. PUSH");
				System.out.println("2. POP");
				System.out.println("3. DISPLAY");
				System.out.println("0. EXIT");
				System.out.println("Enter choice");
				choice=sc.nextInt();
				
				switch(choice)						//choice
				{									//1
				case 1 : push(); break;
				case 2 : pop(); break;
				case 3 : display(); break;
				case 0 : System.exit(0);
				default : System.out.println("Invalid Input");
				}
				
			}while(choice!=0);
	}

	private static void display() {
		if(isEmpty())
		{
			System.out.println("Stack is Empty, Nothing to display");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
			System.out.println(stack[i]);
			}
		}
	}

	private static void pop() {
		if(isFull())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
		int data=stack[top];
		System.out.println(data + "is Popped");
		top--;
		}
		
	}

	private static void push() {				//top
												//-1
		if(isFull())
		{
			System.out.println("Stack is FULL");
		}
		else
		{
		top++;									// 0
		System.out.println("Enter Number to Push");
		int data=sc.nextInt();
		stack[top]=data;
		System.out.println(data + "Pushed onto stack");
		}
		
	}
	
	private static boolean isFull()
	{
		if(top==stack.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private static boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
