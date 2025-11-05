package day33;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numerator");
		int num=sc.nextInt();
		
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		try
		{
		int result=num/den;  //10/2 =5   new ArithmeticException()
		
		System.out.println(result);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Please enter valid denominator");
		}
		
		
		System.out.println("Hiii");

	}

}
