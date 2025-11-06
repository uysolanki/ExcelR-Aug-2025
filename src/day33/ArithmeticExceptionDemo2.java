package day33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");
		int num=sc.nextInt(); //apple
		
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		
		int result=num/den;  //10/2 =5   new ArithmeticException()
		
		System.out.println(result);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Please enter valid denominator");
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Please enter valid Integer Value");
		}
		
		finally
		{
		System.out.println("Hiii");
		}

	}

}
