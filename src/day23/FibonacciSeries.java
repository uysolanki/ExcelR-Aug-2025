package day23;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of Fibonacci Series"); //10
	int length=sc.nextInt();
	int a=0;
	int b=1;
	int c;
	
	System.out.println(a);
	System.out.println(b);
	
	for(int i=3;i<=length;i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
}
}
