package day8;

import java.util.Scanner;

public class SumOfDigitFunctionScenerio3 {
	static int number;
	
	public static void main(String[] args)  //Ambani
	{
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		number=sc.nextInt();					//buy
				
		int ans=sumOfDigit(number);   //call   
		System.out.println("Sum of Digits of number is "+ans);
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
