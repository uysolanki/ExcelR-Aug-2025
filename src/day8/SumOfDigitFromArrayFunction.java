package day8;

import java.util.Scanner;

public class SumOfDigitFromArrayFunction {
	
	
	public static void main(String[] args)  //Ambani
	{
		 int arr[]= {123,777,45,56,18};
						
		for(int i=0;i<arr.length;i++)
		{
			int ans=sumOfDigit(arr[i]);   //call   
			System.out.println("Sum of Digits of " + (i+1) +" number is "+ans);
		}
	}
	
	public static int sumOfDigit(int number)   //Taj
	{
		
		int sum=0;
		while(number>0)
		{
			int r=number%10;
			sum=sum+r;
			number=number/10;
		}
			return sum;
	}

}
