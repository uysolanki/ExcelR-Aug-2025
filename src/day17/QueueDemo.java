package day17;

import java.util.Scanner;

public class QueueDemo {

	static Scanner sc=new Scanner(System.in);
	static int rear=-1;
	static int front=0;
	static int queue[]=new int[5];
	
	
	public static void main(String[] args) {
		int choice;
		do
		{
			System.out.println("**** QUEUE MENU ****");
			
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1 : insert(); break;
			case 2 : myDelete();break;
			case 3 : display();break;
			case 4: System.exit(0);
			}
			
		}while(choice!=4);
	}



	private static void display() {
		if(front>rear)
		{
			System.out.println("Queue Empty, nothing to display");
		}
		else
		{
				for(int i=front;i<=rear;i++)
					{
						System.out.println(queue[i]);
					}
		}

	}

	private static void myDelete() {
		if(isEmpty())
		{
			System.out.println("Queue Empty");
		}
		else
		{
		int data=queue[front];
		System.out.println(data + " is removed");
		front++;
		}
		
	}



	private static void insert() {
		int data;
		
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
		rear++;
		System.out.println("Enter data to insert");
		data=sc.nextInt();
		queue[rear]=data;
		}
		
	}

		public static boolean isFull()
		{
			if(rear==queue.length-1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public static boolean isEmpty()
		{
			if(front>rear)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}
