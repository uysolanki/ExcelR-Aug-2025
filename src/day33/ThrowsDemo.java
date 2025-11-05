package day33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");
		int num = sc.nextInt(); // 10

		System.out.println("Enter Denominator");
		int den = sc.nextInt(); //0
		
		divide(num,den);
		}
	
		catch(ArithmeticException e1)
		{
		System.out.println("Please enter valid denominator");
		}
		catch(InputMismatchException e2)
		{
		System.out.println("Please enter valid Integer Value");
		}
	}

	public static int divide(int num,int den) throws ArithmeticException,InputMismatchException
	{	
		return num / den;	
	}
}
