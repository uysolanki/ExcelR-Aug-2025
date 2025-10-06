package day24;

import java.util.Scanner;

public class FactorialUsingIteration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");			//5
		int number=sc.nextInt();
		
		int result=factorial(number);
		System.out.println("Factotial of " + number + " is "+ result);

	}

	private static int factorial(int number) {
		int fact=1;
		for(int i=number;i>1;i--)				//i			fact
		{										//5			5
			fact=fact*i;						//4			20
		}										//3			60
		return fact;
	}											//2			120
												//1			

}
