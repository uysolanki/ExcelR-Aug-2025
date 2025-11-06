package day33;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo2 {

	public static void main(String[] args) throws IOException
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numerator");
		int num = sc.nextInt(); // 10

		System.out.println("Enter Denominator");
		int den = sc.nextInt(); //0
//		try
//		{
//		divide(num,den);
//		}
//		catch(IOException e1)
//		{
//			
//		}
		
		divide(num,den);
		
	}

	public static int divide(int num,int den) throws IOException
	{	
		return num / den;	
	}
}
