package day24;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");			//1
		int number=sc.nextInt();
		
		int result=factorial(number);
		System.out.println("Factotial of " + number + " is "+ result);

	}

	private static int factorial(int number)   // number 5
	{
		
		if(number==1)
		{
			return 1;
		}
		else
		{
			return number*factorial(number-1);
		}
	}

}
