package day8;

import java.util.Scanner;

public class PrimeFunctionScenerio3 {
	static int number;
	
	public static void main(String[] args)  //Ambani
	{
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		number=sc.nextInt();					//buy
				
		int ans=checkPrime(number);   //call   
		if(ans==2)
			System.out.println(number + " is Prime Number ");		//serve
			else
			System.out.println(number + " is Not Prime Number ");
	}
	
	public static int checkPrime(int number)   //Taj
	{
		
		int counter=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				counter++;
		}
		
		return counter;
			
	}

}
